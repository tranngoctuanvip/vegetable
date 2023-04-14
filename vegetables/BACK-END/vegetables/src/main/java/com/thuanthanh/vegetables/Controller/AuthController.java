package com.thuanthanh.vegetables.Controller;

import com.thuanthanh.vegetables.Entity.Dto.Request.SignInForm;
import com.thuanthanh.vegetables.Entity.Dto.Request.SignUpForm;
import com.thuanthanh.vegetables.Entity.Dto.Response.JwtResponse;
import com.thuanthanh.vegetables.Entity.Dto.Response.ResponMessge;
import com.thuanthanh.vegetables.Entity.Role;
import com.thuanthanh.vegetables.Entity.User;
import com.thuanthanh.vegetables.Service.RoleService;
import com.thuanthanh.vegetables.Service.UserSevice;
import com.thuanthanh.vegetables.StringUtil.Utils;
import com.thuanthanh.vegetables.security.jwt.JwtProvider;
import com.thuanthanh.vegetables.security.userprincal.UserPrinciple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@Controller
@RequestMapping("/api/auth")
public class AuthController {
    @Autowired
    private UserSevice userSevice;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private JwtProvider jwtProvider;
    @Autowired
    private RoleService roleService;

    private Utils utils = new Utils();
    @PostMapping("/signup")
    public ResponseEntity<?> register(@Valid @RequestBody SignUpForm signupForm){
        if(userSevice.existsByUserName(signupForm.getUsername())){
            return new ResponseEntity<>(new ResponMessge("The username exist! please try again!"), HttpStatus.OK);
        }
        User user = new User(signupForm.getUsername(),signupForm.getName(),passwordEncoder.encode(signupForm.getPassword()),signupForm.getAddress(),utils.checkEmail(signupForm.getEmail()),utils.checkPhone(signupForm.getSdt()), signupForm.getRoles());
        userSevice.save(user);
        return new ResponseEntity<>(new ResponMessge("Create user success!"),HttpStatus.OK);
    }

    @PostMapping("signin")
    public ResponseEntity<?> login(@Valid @RequestBody SignInForm signInForm){
        Authentication authentication = authenticationManager.authenticate(
          new UsernamePasswordAuthenticationToken(signInForm.getUsername(),signInForm.getPassword()));
        SecurityContextHolder.getContext().setAuthentication(authentication);
        String token = jwtProvider.creaToken(authentication);
        UserPrinciple userPrinciple = (UserPrinciple) authentication.getPrincipal();
        return ResponseEntity.ok(new JwtResponse(token,userPrinciple.getUser()));
    }
}
