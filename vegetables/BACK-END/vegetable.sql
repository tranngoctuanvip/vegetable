-- MySQL dump 10.13  Distrib 8.0.32, for Win64 (x86_64)
--
-- Host: localhost    Database: vegetable
-- ------------------------------------------------------
-- Server version	8.0.32

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `cart`
--

DROP TABLE IF EXISTS `cart`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cart` (
  `id` int NOT NULL AUTO_INCREMENT,
  `quality` int DEFAULT NULL,
  `sum` double DEFAULT NULL,
  `product_id` int DEFAULT NULL,
  `deleted` int DEFAULT NULL,
  `status` int DEFAULT NULL,
  `user_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK3d704slv66tw6x5hmbm6p2x3u` (`product_id`),
  KEY `FKl70asp4l4w0jmbm1tqyofho4o` (`user_id`)
) ENGINE=MyISAM AUTO_INCREMENT=24 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cart`
--

LOCK TABLES `cart` WRITE;
/*!40000 ALTER TABLE `cart` DISABLE KEYS */;
INSERT INTO `cart` VALUES (23,4,17176,4,0,1,17),(22,4,92,5,0,1,17),(21,4,92,6,0,1,17),(20,4,92,7,0,1,17),(19,4,92,9,0,1,17),(18,9,207,10,0,1,17),(17,9,207,10,0,1,17);
/*!40000 ALTER TABLE `cart` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `category`
--

DROP TABLE IF EXISTS `category`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `category` (
  `id` int NOT NULL AUTO_INCREMENT,
  `create_time` datetime DEFAULT NULL,
  `deleted` int DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `status` int DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `parent_id` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=28 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `category`
--

LOCK TABLES `category` WRITE;
/*!40000 ALTER TABLE `category` DISABLE KEYS */;
INSERT INTO `category` VALUES (1,'2023-04-12 11:22:30',0,'bưởi',1,NULL,13),(2,'2023-04-12 11:22:35',0,'cam',1,NULL,13),(3,'2023-04-12 11:22:39',0,'xoài',1,NULL,13),(4,'2023-04-12 11:22:42',0,'táo',1,NULL,13),(5,'2023-04-12 11:22:46',0,'lê',1,NULL,13),(6,'2023-04-12 11:22:50',0,'chôm chôm',1,NULL,13),(7,'2023-04-12 11:22:56',0,'rau mùi',1,NULL,11),(8,'2023-04-12 11:23:00',0,'rau rền',1,NULL,11),(9,'2023-04-12 11:23:05',0,'rau mồng tơi',1,NULL,11),(10,'2023-04-12 11:23:13',0,'rau muống',1,NULL,11),(11,'2023-04-17 16:31:05',0,'rau',1,NULL,NULL),(12,'2023-04-17 16:31:11',0,'củ',1,NULL,NULL),(13,'2023-04-17 16:31:16',0,'quả',1,NULL,NULL),(14,'2023-04-17 16:31:21',0,'thịt',1,NULL,NULL),(15,'2023-04-17 16:31:29',0,'đồ uống',1,NULL,NULL),(16,'2023-04-17 16:32:01',0,'sinh tố',1,NULL,NULL),(17,'2023-04-18 15:19:20',0,'rau rền 3',1,NULL,8),(18,'2023-04-18 15:19:24',0,'rau rền 4',1,NULL,17),(19,'2023-04-18 15:19:28',0,'rau rền 5',1,NULL,8),(20,'2023-04-18 15:19:31',0,'rau rền 6',1,NULL,19),(21,'2023-04-18 15:19:56',0,'lê 1',1,NULL,5),(22,'2023-04-18 15:20:00',0,'lê 2',1,NULL,5),(23,'2023-04-18 15:20:03',0,'lê 3',1,NULL,21),(24,'2023-04-18 15:20:06',0,'lê 4',1,NULL,22),(25,'2023-04-18 15:20:10',0,'lê 5',1,NULL,5),(26,'2023-04-18 15:20:50',0,'lê 6',1,NULL,5),(27,'2023-04-18 15:20:55',0,'lê 7',1,NULL,5);
/*!40000 ALTER TABLE `category` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `contact`
--

DROP TABLE IF EXISTS `contact`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `contact` (
  `id` int NOT NULL AUTO_INCREMENT,
  `contact_date` datetime DEFAULT NULL,
  `content_contact` varchar(255) DEFAULT NULL,
  `emailcontact` varchar(50) DEFAULT NULL,
  `replycontent` varchar(255) DEFAULT NULL,
  `reply_date` datetime DEFAULT NULL,
  `user_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKe07k4jcfdophemi6j1lt84b61` (`user_id`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `contact`
--

LOCK TABLES `contact` WRITE;
/*!40000 ALTER TABLE `contact` DISABLE KEYS */;
INSERT INTO `contact` VALUES (1,'2023-04-13 09:26:33','khi nào mình nhận được hàng','faker2kvip@gmail.com',NULL,NULL,2);
/*!40000 ALTER TABLE `contact` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `detailproduct`
--

DROP TABLE IF EXISTS `detailproduct`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `detailproduct` (
  `id` int NOT NULL AUTO_INCREMENT,
  `create_time` datetime DEFAULT NULL,
  `detail` varchar(10000) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `product_id` int DEFAULT NULL,
  `deleted` int DEFAULT NULL,
  `status` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKj9ld5q9awjcbyta7qwe9pgpsq` (`product_id`)
) ENGINE=MyISAM AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `detailproduct`
--

LOCK TABLES `detailproduct` WRITE;
/*!40000 ALTER TABLE `detailproduct` DISABLE KEYS */;
INSERT INTO `detailproduct` VALUES (1,'2023-04-13 13:51:54','Hành tím là một loại thực phẩm quen thuộc trong mỗi gian bếp của người Việt. Ngoài việc làm thức ăn trở nên thơm ngon, loại củ này còn tốt cho sức khỏe. Cùng BlogAnChoi điểm tên những lợi ích của hành tím nhé! Hành tím chứa nhiều chất dinh dưỡng cần thiết và được coi là một trong những chất kháng viêm hiệu quả. Chúng được sử dụng thường xuyên trong ăn uống và ngăn ngừa các bệnh thường gặp. Cụ thể, hành tím có chứa nhiều vitamin như A, B6, C , các loại axit folic, canxi, photpho, magie, sắt, chromium và khá nhiều chất xơ rất tốt cho sức khỏe.&nbsp;Bạn có thể mua hành tím tại đây. Trong hành tím chứa rất nhiều dưỡng chất có lợi cho sức khỏe. (Nguồn: Internet)6 lợi ích của hành tím đối với sức khỏe 1. Giúp kháng viêm, diệt khuẩn Trong hành tím có nhiều chất có tác dụng kháng viêm giúp loại bỏ độc tố trong cơ thể. Chất hóa học trong hành tím giúp bảo vệ dạ dày, ngăn ngừa viêm loét và thúc đẩy việc sản sinh các loại vi khuẩn có lợi cho đường ruột. Trong hành tím lại có nhiều chất xơ giúp bảo vệ hệ tiêu hóa, chống táo bón đồng thời ngăn ngừa nhiễm trùng các cơ quan trong cơ thể như dạ dày, bàng quang,…2. Ngăn ngừa và điều trị tiểu đường Hành tím chứa chromium giúp cơ thể những người mắc tiểu đường có những&nbsp;phản ứng phù hợp để giảm lượng insulin và cải thiện lượng đường trong máu, từ đó giúp ngăn ngừa nguy cơ mắc bệnh hoặc làm bệnh trở nặng.',NULL,2,0,1),(2,'2023-04-13 14:07:43','6 lợi ích của hành tím trong điều trị và ngăn ngừa bệnh tật - BlogAnChoi','2023-04-17 11:43:38',2,0,1),(3,'2023-04-13 13:53:27','Hành tím là một loại thực phẩm quen thuộc trong mỗi gian bếp của người Việt. Ngoài việc làm thức ăn trở nên thơm ngon, loại củ này còn tốt cho sức khỏe. Cùng BlogAnChoi điểm tên những lợi ích của hành tím nhé! Hành tím chứa nhiều chất dinh dưỡng cần thiết và được coi là một trong những chất kháng viêm hiệu quả. Chúng được sử dụng thường xuyên trong ăn uống và ngăn ngừa các bệnh thường gặp. Cụ thể, hành tím có chứa nhiều vitamin như A, B6, C , các loại axit folic, canxi, photpho, magie, sắt, chromium và khá nhiều chất xơ rất tốt cho sức khỏe.&nbsp;Bạn có thể mua hành tím tại đây. Trong hành tím chứa rất nhiều dưỡng chất có lợi cho sức khỏe. (Nguồn: Internet)6 lợi ích của hành tím đối với sức khỏe 1. Giúp kháng viêm, diệt khuẩn Trong hành tím có nhiều chất có tác dụng kháng viêm giúp loại bỏ độc tố trong cơ thể. Chất hóa học trong hành tím giúp bảo vệ dạ dày, ngăn ngừa viêm loét và thúc đẩy việc sản sinh các loại vi khuẩn có lợi cho đường ruột. Trong hành tím lại có nhiều chất xơ giúp bảo vệ hệ tiêu hóa, chống táo bón đồng thời ngăn ngừa nhiễm trùng các cơ quan trong cơ thể như dạ dày, bàng quang,…2. Ngăn ngừa và điều trị tiểu đường Hành tím chứa chromium giúp cơ thể những người mắc tiểu đường có những&nbsp;phản ứng phù hợp để giảm lượng insulin và cải thiện lượng đường trong máu, từ đó giúp ngăn ngừa nguy cơ mắc bệnh hoặc làm bệnh trở nặng.',NULL,4,0,1),(4,'2023-04-13 13:53:30','Hành tím là một loại thực phẩm quen thuộc trong mỗi gian bếp của người Việt. Ngoài việc làm thức ăn trở nên thơm ngon, loại củ này còn tốt cho sức khỏe. Cùng BlogAnChoi điểm tên những lợi ích của hành tím nhé! Hành tím chứa nhiều chất dinh dưỡng cần thiết và được coi là một trong những chất kháng viêm hiệu quả. Chúng được sử dụng thường xuyên trong ăn uống và ngăn ngừa các bệnh thường gặp. Cụ thể, hành tím có chứa nhiều vitamin như A, B6, C , các loại axit folic, canxi, photpho, magie, sắt, chromium và khá nhiều chất xơ rất tốt cho sức khỏe.&nbsp;Bạn có thể mua hành tím tại đây. Trong hành tím chứa rất nhiều dưỡng chất có lợi cho sức khỏe. (Nguồn: Internet)6 lợi ích của hành tím đối với sức khỏe 1. Giúp kháng viêm, diệt khuẩn Trong hành tím có nhiều chất có tác dụng kháng viêm giúp loại bỏ độc tố trong cơ thể. Chất hóa học trong hành tím giúp bảo vệ dạ dày, ngăn ngừa viêm loét và thúc đẩy việc sản sinh các loại vi khuẩn có lợi cho đường ruột. Trong hành tím lại có nhiều chất xơ giúp bảo vệ hệ tiêu hóa, chống táo bón đồng thời ngăn ngừa nhiễm trùng các cơ quan trong cơ thể như dạ dày, bàng quang,…2. Ngăn ngừa và điều trị tiểu đường Hành tím chứa chromium giúp cơ thể những người mắc tiểu đường có những&nbsp;phản ứng phù hợp để giảm lượng insulin và cải thiện lượng đường trong máu, từ đó giúp ngăn ngừa nguy cơ mắc bệnh hoặc làm bệnh trở nặng.',NULL,5,0,1),(5,'2023-04-13 13:53:34','Hành tím là một loại thực phẩm quen thuộc trong mỗi gian bếp của người Việt. Ngoài việc làm thức ăn trở nên thơm ngon, loại củ này còn tốt cho sức khỏe. Cùng BlogAnChoi điểm tên những lợi ích của hành tím nhé! Hành tím chứa nhiều chất dinh dưỡng cần thiết và được coi là một trong những chất kháng viêm hiệu quả. Chúng được sử dụng thường xuyên trong ăn uống và ngăn ngừa các bệnh thường gặp. Cụ thể, hành tím có chứa nhiều vitamin như A, B6, C , các loại axit folic, canxi, photpho, magie, sắt, chromium và khá nhiều chất xơ rất tốt cho sức khỏe.&nbsp;Bạn có thể mua hành tím tại đây. Trong hành tím chứa rất nhiều dưỡng chất có lợi cho sức khỏe. (Nguồn: Internet)6 lợi ích của hành tím đối với sức khỏe 1. Giúp kháng viêm, diệt khuẩn Trong hành tím có nhiều chất có tác dụng kháng viêm giúp loại bỏ độc tố trong cơ thể. Chất hóa học trong hành tím giúp bảo vệ dạ dày, ngăn ngừa viêm loét và thúc đẩy việc sản sinh các loại vi khuẩn có lợi cho đường ruột. Trong hành tím lại có nhiều chất xơ giúp bảo vệ hệ tiêu hóa, chống táo bón đồng thời ngăn ngừa nhiễm trùng các cơ quan trong cơ thể như dạ dày, bàng quang,…2. Ngăn ngừa và điều trị tiểu đường Hành tím chứa chromium giúp cơ thể những người mắc tiểu đường có những&nbsp;phản ứng phù hợp để giảm lượng insulin và cải thiện lượng đường trong máu, từ đó giúp ngăn ngừa nguy cơ mắc bệnh hoặc làm bệnh trở nặng.',NULL,6,0,1),(6,'2023-04-13 13:53:37','Hành tím là một loại thực phẩm quen thuộc trong mỗi gian bếp của người Việt. Ngoài việc làm thức ăn trở nên thơm ngon, loại củ này còn tốt cho sức khỏe. Cùng BlogAnChoi điểm tên những lợi ích của hành tím nhé! Hành tím chứa nhiều chất dinh dưỡng cần thiết và được coi là một trong những chất kháng viêm hiệu quả. Chúng được sử dụng thường xuyên trong ăn uống và ngăn ngừa các bệnh thường gặp. Cụ thể, hành tím có chứa nhiều vitamin như A, B6, C , các loại axit folic, canxi, photpho, magie, sắt, chromium và khá nhiều chất xơ rất tốt cho sức khỏe.&nbsp;Bạn có thể mua hành tím tại đây. Trong hành tím chứa rất nhiều dưỡng chất có lợi cho sức khỏe. (Nguồn: Internet)6 lợi ích của hành tím đối với sức khỏe 1. Giúp kháng viêm, diệt khuẩn Trong hành tím có nhiều chất có tác dụng kháng viêm giúp loại bỏ độc tố trong cơ thể. Chất hóa học trong hành tím giúp bảo vệ dạ dày, ngăn ngừa viêm loét và thúc đẩy việc sản sinh các loại vi khuẩn có lợi cho đường ruột. Trong hành tím lại có nhiều chất xơ giúp bảo vệ hệ tiêu hóa, chống táo bón đồng thời ngăn ngừa nhiễm trùng các cơ quan trong cơ thể như dạ dày, bàng quang,…2. Ngăn ngừa và điều trị tiểu đường Hành tím chứa chromium giúp cơ thể những người mắc tiểu đường có những&nbsp;phản ứng phù hợp để giảm lượng insulin và cải thiện lượng đường trong máu, từ đó giúp ngăn ngừa nguy cơ mắc bệnh hoặc làm bệnh trở nặng.',NULL,7,0,1),(7,'2023-04-13 13:53:40','Hành tím là một loại thực phẩm quen thuộc trong mỗi gian bếp của người Việt. Ngoài việc làm thức ăn trở nên thơm ngon, loại củ này còn tốt cho sức khỏe. Cùng BlogAnChoi điểm tên những lợi ích của hành tím nhé! Hành tím chứa nhiều chất dinh dưỡng cần thiết và được coi là một trong những chất kháng viêm hiệu quả. Chúng được sử dụng thường xuyên trong ăn uống và ngăn ngừa các bệnh thường gặp. Cụ thể, hành tím có chứa nhiều vitamin như A, B6, C , các loại axit folic, canxi, photpho, magie, sắt, chromium và khá nhiều chất xơ rất tốt cho sức khỏe.&nbsp;Bạn có thể mua hành tím tại đây. Trong hành tím chứa rất nhiều dưỡng chất có lợi cho sức khỏe. (Nguồn: Internet)6 lợi ích của hành tím đối với sức khỏe 1. Giúp kháng viêm, diệt khuẩn Trong hành tím có nhiều chất có tác dụng kháng viêm giúp loại bỏ độc tố trong cơ thể. Chất hóa học trong hành tím giúp bảo vệ dạ dày, ngăn ngừa viêm loét và thúc đẩy việc sản sinh các loại vi khuẩn có lợi cho đường ruột. Trong hành tím lại có nhiều chất xơ giúp bảo vệ hệ tiêu hóa, chống táo bón đồng thời ngăn ngừa nhiễm trùng các cơ quan trong cơ thể như dạ dày, bàng quang,…2. Ngăn ngừa và điều trị tiểu đường Hành tím chứa chromium giúp cơ thể những người mắc tiểu đường có những&nbsp;phản ứng phù hợp để giảm lượng insulin và cải thiện lượng đường trong máu, từ đó giúp ngăn ngừa nguy cơ mắc bệnh hoặc làm bệnh trở nặng.',NULL,8,0,1),(8,'2023-04-13 13:53:43','Hành tím là một loại thực phẩm quen thuộc trong mỗi gian bếp của người Việt. Ngoài việc làm thức ăn trở nên thơm ngon, loại củ này còn tốt cho sức khỏe. Cùng BlogAnChoi điểm tên những lợi ích của hành tím nhé! Hành tím chứa nhiều chất dinh dưỡng cần thiết và được coi là một trong những chất kháng viêm hiệu quả. Chúng được sử dụng thường xuyên trong ăn uống và ngăn ngừa các bệnh thường gặp. Cụ thể, hành tím có chứa nhiều vitamin như A, B6, C , các loại axit folic, canxi, photpho, magie, sắt, chromium và khá nhiều chất xơ rất tốt cho sức khỏe.&nbsp;Bạn có thể mua hành tím tại đây. Trong hành tím chứa rất nhiều dưỡng chất có lợi cho sức khỏe. (Nguồn: Internet)6 lợi ích của hành tím đối với sức khỏe 1. Giúp kháng viêm, diệt khuẩn Trong hành tím có nhiều chất có tác dụng kháng viêm giúp loại bỏ độc tố trong cơ thể. Chất hóa học trong hành tím giúp bảo vệ dạ dày, ngăn ngừa viêm loét và thúc đẩy việc sản sinh các loại vi khuẩn có lợi cho đường ruột. Trong hành tím lại có nhiều chất xơ giúp bảo vệ hệ tiêu hóa, chống táo bón đồng thời ngăn ngừa nhiễm trùng các cơ quan trong cơ thể như dạ dày, bàng quang,…2. Ngăn ngừa và điều trị tiểu đường Hành tím chứa chromium giúp cơ thể những người mắc tiểu đường có những&nbsp;phản ứng phù hợp để giảm lượng insulin và cải thiện lượng đường trong máu, từ đó giúp ngăn ngừa nguy cơ mắc bệnh hoặc làm bệnh trở nặng.',NULL,9,0,1),(9,'2023-04-13 13:53:46','Hành tím là một loại thực phẩm quen thuộc trong mỗi gian bếp của người Việt. Ngoài việc làm thức ăn trở nên thơm ngon, loại củ này còn tốt cho sức khỏe. Cùng BlogAnChoi điểm tên những lợi ích của hành tím nhé! Hành tím chứa nhiều chất dinh dưỡng cần thiết và được coi là một trong những chất kháng viêm hiệu quả. Chúng được sử dụng thường xuyên trong ăn uống và ngăn ngừa các bệnh thường gặp. Cụ thể, hành tím có chứa nhiều vitamin như A, B6, C , các loại axit folic, canxi, photpho, magie, sắt, chromium và khá nhiều chất xơ rất tốt cho sức khỏe.&nbsp;Bạn có thể mua hành tím tại đây. Trong hành tím chứa rất nhiều dưỡng chất có lợi cho sức khỏe. (Nguồn: Internet)6 lợi ích của hành tím đối với sức khỏe 1. Giúp kháng viêm, diệt khuẩn Trong hành tím có nhiều chất có tác dụng kháng viêm giúp loại bỏ độc tố trong cơ thể. Chất hóa học trong hành tím giúp bảo vệ dạ dày, ngăn ngừa viêm loét và thúc đẩy việc sản sinh các loại vi khuẩn có lợi cho đường ruột. Trong hành tím lại có nhiều chất xơ giúp bảo vệ hệ tiêu hóa, chống táo bón đồng thời ngăn ngừa nhiễm trùng các cơ quan trong cơ thể như dạ dày, bàng quang,…2. Ngăn ngừa và điều trị tiểu đường Hành tím chứa chromium giúp cơ thể những người mắc tiểu đường có những&nbsp;phản ứng phù hợp để giảm lượng insulin và cải thiện lượng đường trong máu, từ đó giúp ngăn ngừa nguy cơ mắc bệnh hoặc làm bệnh trở nặng.',NULL,10,0,1),(10,'2023-04-13 13:53:50','Hành tím là một loại thực phẩm quen thuộc trong mỗi gian bếp của người Việt. Ngoài việc làm thức ăn trở nên thơm ngon, loại củ này còn tốt cho sức khỏe. Cùng BlogAnChoi điểm tên những lợi ích của hành tím nhé! Hành tím chứa nhiều chất dinh dưỡng cần thiết và được coi là một trong những chất kháng viêm hiệu quả. Chúng được sử dụng thường xuyên trong ăn uống và ngăn ngừa các bệnh thường gặp. Cụ thể, hành tím có chứa nhiều vitamin như A, B6, C , các loại axit folic, canxi, photpho, magie, sắt, chromium và khá nhiều chất xơ rất tốt cho sức khỏe.&nbsp;Bạn có thể mua hành tím tại đây. Trong hành tím chứa rất nhiều dưỡng chất có lợi cho sức khỏe. (Nguồn: Internet)6 lợi ích của hành tím đối với sức khỏe 1. Giúp kháng viêm, diệt khuẩn Trong hành tím có nhiều chất có tác dụng kháng viêm giúp loại bỏ độc tố trong cơ thể. Chất hóa học trong hành tím giúp bảo vệ dạ dày, ngăn ngừa viêm loét và thúc đẩy việc sản sinh các loại vi khuẩn có lợi cho đường ruột. Trong hành tím lại có nhiều chất xơ giúp bảo vệ hệ tiêu hóa, chống táo bón đồng thời ngăn ngừa nhiễm trùng các cơ quan trong cơ thể như dạ dày, bàng quang,…2. Ngăn ngừa và điều trị tiểu đường Hành tím chứa chromium giúp cơ thể những người mắc tiểu đường có những&nbsp;phản ứng phù hợp để giảm lượng insulin và cải thiện lượng đường trong máu, từ đó giúp ngăn ngừa nguy cơ mắc bệnh hoặc làm bệnh trở nặng.',NULL,11,0,1),(11,'2023-04-13 13:53:54','Hành tím là một loại thực phẩm quen thuộc trong mỗi gian bếp của người Việt. Ngoài việc làm thức ăn trở nên thơm ngon, loại củ này còn tốt cho sức khỏe. Cùng BlogAnChoi điểm tên những lợi ích của hành tím nhé! Hành tím chứa nhiều chất dinh dưỡng cần thiết và được coi là một trong những chất kháng viêm hiệu quả. Chúng được sử dụng thường xuyên trong ăn uống và ngăn ngừa các bệnh thường gặp. Cụ thể, hành tím có chứa nhiều vitamin như A, B6, C , các loại axit folic, canxi, photpho, magie, sắt, chromium và khá nhiều chất xơ rất tốt cho sức khỏe.&nbsp;Bạn có thể mua hành tím tại đây. Trong hành tím chứa rất nhiều dưỡng chất có lợi cho sức khỏe. (Nguồn: Internet)6 lợi ích của hành tím đối với sức khỏe 1. Giúp kháng viêm, diệt khuẩn Trong hành tím có nhiều chất có tác dụng kháng viêm giúp loại bỏ độc tố trong cơ thể. Chất hóa học trong hành tím giúp bảo vệ dạ dày, ngăn ngừa viêm loét và thúc đẩy việc sản sinh các loại vi khuẩn có lợi cho đường ruột. Trong hành tím lại có nhiều chất xơ giúp bảo vệ hệ tiêu hóa, chống táo bón đồng thời ngăn ngừa nhiễm trùng các cơ quan trong cơ thể như dạ dày, bàng quang,…2. Ngăn ngừa và điều trị tiểu đường Hành tím chứa chromium giúp cơ thể những người mắc tiểu đường có những&nbsp;phản ứng phù hợp để giảm lượng insulin và cải thiện lượng đường trong máu, từ đó giúp ngăn ngừa nguy cơ mắc bệnh hoặc làm bệnh trở nặng.',NULL,12,0,1),(12,'2023-04-13 13:53:58','Hành tím là một loại thực phẩm quen thuộc trong mỗi gian bếp của người Việt. Ngoài việc làm thức ăn trở nên thơm ngon, loại củ này còn tốt cho sức khỏe. Cùng BlogAnChoi điểm tên những lợi ích của hành tím nhé! Hành tím chứa nhiều chất dinh dưỡng cần thiết và được coi là một trong những chất kháng viêm hiệu quả. Chúng được sử dụng thường xuyên trong ăn uống và ngăn ngừa các bệnh thường gặp. Cụ thể, hành tím có chứa nhiều vitamin như A, B6, C , các loại axit folic, canxi, photpho, magie, sắt, chromium và khá nhiều chất xơ rất tốt cho sức khỏe.&nbsp;Bạn có thể mua hành tím tại đây. Trong hành tím chứa rất nhiều dưỡng chất có lợi cho sức khỏe. (Nguồn: Internet)6 lợi ích của hành tím đối với sức khỏe 1. Giúp kháng viêm, diệt khuẩn Trong hành tím có nhiều chất có tác dụng kháng viêm giúp loại bỏ độc tố trong cơ thể. Chất hóa học trong hành tím giúp bảo vệ dạ dày, ngăn ngừa viêm loét và thúc đẩy việc sản sinh các loại vi khuẩn có lợi cho đường ruột. Trong hành tím lại có nhiều chất xơ giúp bảo vệ hệ tiêu hóa, chống táo bón đồng thời ngăn ngừa nhiễm trùng các cơ quan trong cơ thể như dạ dày, bàng quang,…2. Ngăn ngừa và điều trị tiểu đường Hành tím chứa chromium giúp cơ thể những người mắc tiểu đường có những&nbsp;phản ứng phù hợp để giảm lượng insulin và cải thiện lượng đường trong máu, từ đó giúp ngăn ngừa nguy cơ mắc bệnh hoặc làm bệnh trở nặng.',NULL,13,0,1),(13,'2023-04-13 13:54:02','Hành tím là một loại thực phẩm quen thuộc trong mỗi gian bếp của người Việt. Ngoài việc làm thức ăn trở nên thơm ngon, loại củ này còn tốt cho sức khỏe. Cùng BlogAnChoi điểm tên những lợi ích của hành tím nhé! Hành tím chứa nhiều chất dinh dưỡng cần thiết và được coi là một trong những chất kháng viêm hiệu quả. Chúng được sử dụng thường xuyên trong ăn uống và ngăn ngừa các bệnh thường gặp. Cụ thể, hành tím có chứa nhiều vitamin như A, B6, C , các loại axit folic, canxi, photpho, magie, sắt, chromium và khá nhiều chất xơ rất tốt cho sức khỏe.&nbsp;Bạn có thể mua hành tím tại đây. Trong hành tím chứa rất nhiều dưỡng chất có lợi cho sức khỏe. (Nguồn: Internet)6 lợi ích của hành tím đối với sức khỏe 1. Giúp kháng viêm, diệt khuẩn Trong hành tím có nhiều chất có tác dụng kháng viêm giúp loại bỏ độc tố trong cơ thể. Chất hóa học trong hành tím giúp bảo vệ dạ dày, ngăn ngừa viêm loét và thúc đẩy việc sản sinh các loại vi khuẩn có lợi cho đường ruột. Trong hành tím lại có nhiều chất xơ giúp bảo vệ hệ tiêu hóa, chống táo bón đồng thời ngăn ngừa nhiễm trùng các cơ quan trong cơ thể như dạ dày, bàng quang,…2. Ngăn ngừa và điều trị tiểu đường Hành tím chứa chromium giúp cơ thể những người mắc tiểu đường có những&nbsp;phản ứng phù hợp để giảm lượng insulin và cải thiện lượng đường trong máu, từ đó giúp ngăn ngừa nguy cơ mắc bệnh hoặc làm bệnh trở nặng.',NULL,14,0,1),(14,'2023-04-13 13:54:05','Hành tím là một loại thực phẩm quen thuộc trong mỗi gian bếp của người Việt. Ngoài việc làm thức ăn trở nên thơm ngon, loại củ này còn tốt cho sức khỏe. Cùng BlogAnChoi điểm tên những lợi ích của hành tím nhé! Hành tím chứa nhiều chất dinh dưỡng cần thiết và được coi là một trong những chất kháng viêm hiệu quả. Chúng được sử dụng thường xuyên trong ăn uống và ngăn ngừa các bệnh thường gặp. Cụ thể, hành tím có chứa nhiều vitamin như A, B6, C , các loại axit folic, canxi, photpho, magie, sắt, chromium và khá nhiều chất xơ rất tốt cho sức khỏe.&nbsp;Bạn có thể mua hành tím tại đây. Trong hành tím chứa rất nhiều dưỡng chất có lợi cho sức khỏe. (Nguồn: Internet)6 lợi ích của hành tím đối với sức khỏe 1. Giúp kháng viêm, diệt khuẩn Trong hành tím có nhiều chất có tác dụng kháng viêm giúp loại bỏ độc tố trong cơ thể. Chất hóa học trong hành tím giúp bảo vệ dạ dày, ngăn ngừa viêm loét và thúc đẩy việc sản sinh các loại vi khuẩn có lợi cho đường ruột. Trong hành tím lại có nhiều chất xơ giúp bảo vệ hệ tiêu hóa, chống táo bón đồng thời ngăn ngừa nhiễm trùng các cơ quan trong cơ thể như dạ dày, bàng quang,…2. Ngăn ngừa và điều trị tiểu đường Hành tím chứa chromium giúp cơ thể những người mắc tiểu đường có những&nbsp;phản ứng phù hợp để giảm lượng insulin và cải thiện lượng đường trong máu, từ đó giúp ngăn ngừa nguy cơ mắc bệnh hoặc làm bệnh trở nặng.',NULL,15,0,1);
/*!40000 ALTER TABLE `detailproduct` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `order_detail`
--

DROP TABLE IF EXISTS `order_detail`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `order_detail` (
  `id` int NOT NULL AUTO_INCREMENT,
  `order_id` int DEFAULT NULL,
  `product_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKcw8s0t3s3864enr2ql4y4bvh1` (`order_id`),
  KEY `FKb8bg2bkty0oksa3wiq5mp5qnc` (`product_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `order_detail`
--

LOCK TABLES `order_detail` WRITE;
/*!40000 ALTER TABLE `order_detail` DISABLE KEYS */;
/*!40000 ALTER TABLE `order_detail` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `orderv`
--

DROP TABLE IF EXISTS `orderv`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `orderv` (
  `id` int NOT NULL AUTO_INCREMENT,
  `address` varchar(100) DEFAULT NULL,
  `fullname` varchar(255) DEFAULT NULL,
  `note` varchar(255) DEFAULT NULL,
  `order_date` datetime DEFAULT NULL,
  `order_status` int DEFAULT NULL,
  `sdt` varchar(50) DEFAULT NULL,
  `cart_id` int DEFAULT NULL,
  `user_id` int DEFAULT NULL,
  `date_of_receipt_of_goods` datetime DEFAULT NULL,
  `delivery_date` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKl8jp6sjk33886sngyi00kekbq` (`cart_id`),
  KEY `FKn26jmlg2g8y04yob739p8cmh4` (`user_id`)
) ENGINE=MyISAM AUTO_INCREMENT=30 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orderv`
--

LOCK TABLES `orderv` WRITE;
/*!40000 ALTER TABLE `orderv` DISABLE KEYS */;
INSERT INTO `orderv` VALUES (12,'Vĩnh Phúc','Tuấn Trần','Giao nhanh giúp mình ạ','2023-04-14 15:45:05',2,'0352744465',21,9,'2023-04-14 15:48:53','Thu Apr 13 00:00:00 ICT 2023'),(11,'Vĩnh Phúc','Tuấn Trần','Giao nhanh giúp mình ạ','2023-04-14 15:45:00',2,'0352744465',20,9,'2023-04-14 15:48:50','Thu Apr 13 00:00:00 ICT 2023'),(9,'Vĩnh Phúc','Tuấn Trần','Giao nhanh giúp mình ạ','2023-04-14 15:44:51',2,'0352744465',18,9,'2023-04-14 15:48:44','Thu Apr 13 00:00:00 ICT 2023'),(10,'Vĩnh Phúc','Tuấn Trần','Giao nhanh giúp mình ạ','2023-04-14 15:44:54',2,'0352744465',19,9,'2023-04-14 15:48:48','Thu Apr 13 00:00:00 ICT 2023'),(8,'Vĩnh Phúc','Tuấn Trần','Giao nhanh giúp mình ạ','2023-04-14 15:44:38',2,'0352744465',17,9,'2023-04-14 15:48:40','Thu Apr 13 00:00:00 ICT 2023'),(7,'Vĩnh Phúc','Tuấn Trần','Giao nhanh giúp mình ạ','2023-04-14 15:28:33',2,'0352744465',9,9,'2023-04-14 15:32:15','Thu Apr 13 00:00:00 ICT 2023'),(13,'Vĩnh Phúc','Tuấn Trần','Giao nhanh giúp mình ạ','2023-04-14 15:45:08',2,'0352744465',22,9,'2023-04-14 15:49:00','Thu Apr 13 00:00:00 ICT 2023'),(14,'Vĩnh Phúc','Tuấn Trần','Giao nhanh giúp mình ạ','2023-04-14 15:45:11',2,'0352744465',23,9,'2023-04-14 15:49:04','Thu Apr 13 00:00:00 ICT 2023'),(15,'Vĩnh Phúc','Tuấn Trần','Giao nhanh giúp mình ạ','2023-04-17 16:52:36',2,'0352744465',23,9,NULL,NULL),(16,'Vĩnh Phúc','Tuấn Trần','Giao nhanh giúp mình ạ','2023-04-17 16:52:38',2,'0352744465',23,9,NULL,NULL),(17,'Vĩnh Phúc','Tuấn Trần','Giao nhanh giúp mình ạ','2023-04-17 16:52:40',2,'0352744465',23,9,NULL,NULL),(18,'Vĩnh Phúc','Tuấn Trần','Giao nhanh giúp mình ạ','2023-04-17 16:52:40',2,'0352744465',23,9,NULL,NULL),(19,'Vĩnh Phúc','Tuấn Trần','Giao nhanh giúp mình ạ','2023-04-17 16:52:41',2,'0352744465',23,9,NULL,NULL),(20,'Vĩnh Phúc','Tuấn Trần','Giao nhanh giúp mình ạ','2023-04-17 16:52:42',2,'0352744465',23,9,NULL,NULL),(21,'Vĩnh Phúc','Tuấn Trần','Giao nhanh giúp mình ạ','2023-04-17 16:52:42',1,'0352744465',23,9,NULL,NULL),(22,'Vĩnh Phúc','Tuấn Trần','Giao nhanh giúp mình ạ','2023-04-17 16:52:43',1,'0352744465',23,9,NULL,NULL),(23,'Vĩnh Phúc','Tuấn Trần','Giao nhanh giúp mình ạ','2023-04-17 16:52:44',1,'0352744465',23,9,NULL,NULL),(24,'Vĩnh Phúc','Tuấn Trần','Giao nhanh giúp mình ạ','2023-04-17 16:52:45',1,'0352744465',23,9,NULL,NULL),(25,'Vĩnh Phúc','Tuấn Trần','Giao nhanh giúp mình ạ','2023-04-17 16:52:45',1,'0352744465',23,9,NULL,NULL),(26,'Vĩnh Phúc','Tuấn Trần','Giao nhanh giúp mình ạ','2023-04-17 16:52:46',1,'0352744465',23,9,NULL,NULL),(27,'Vĩnh Phúc','Tuấn Trần','Giao nhanh giúp mình ạ','2023-04-17 16:52:46',1,'0352744465',23,9,NULL,NULL),(28,'Vĩnh Phúc','Tuấn Trần','Giao nhanh giúp mình ạ','2023-04-17 16:52:47',1,'0352744465',23,9,NULL,NULL),(29,'Vĩnh Phúc','Tuấn Trần','Giao nhanh giúp mình ạ','2023-04-17 16:52:47',1,'0352744465',23,9,NULL,NULL);
/*!40000 ALTER TABLE `orderv` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product`
--

DROP TABLE IF EXISTS `product`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `product` (
  `id` int NOT NULL AUTO_INCREMENT,
  `create_time` datetime DEFAULT NULL,
  `deleted` int DEFAULT NULL,
  `image` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `price` double DEFAULT NULL,
  `quality` varchar(50) DEFAULT NULL,
  `status` int DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `category_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK1mtsbur82frn64de7balymq9s` (`category_id`)
) ENGINE=MyISAM AUTO_INCREMENT=50 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product`
--

LOCK TABLES `product` WRITE;
/*!40000 ALTER TABLE `product` DISABLE KEYS */;
INSERT INTO `product` VALUES (1,'2023-04-12 11:23:30',0,'https://cdn.shopify.com/s/files/1/0274/3481/articles/LYOFOOD-freeze-dried-organic-beetroot-powders-EU-01.jpg?v=1490710701','mồng tơi',23000,'21',1,NULL,9),(2,'2023-04-12 11:23:35',0,'https://cdn.shopify.com/s/files/1/0274/3481/articles/LYOFOOD-freeze-dried-organic-beetroot-powders-EU-01.jpg?v=1490710701','cải thìa',10000,'21',1,NULL,8),(3,'2023-04-12 11:23:40',0,'https://cdn.shopify.com/s/files/1/0274/3481/articles/LYOFOOD-freeze-dried-organic-beetroot-powders-EU-01.jpg?v=1490710701','chuối',5000,'21',1,NULL,7),(4,'2023-04-12 11:23:42',0,'https://cdn.shopify.com/s/files/1/0274/3481/articles/LYOFOOD-freeze-dried-organic-beetroot-powders-EU-01.jpg?v=1490710701','oot',4294,'20',1,'2023-04-17 10:14:05',4),(5,'2023-04-12 11:23:43',0,'https://cdn.shopify.com/s/files/1/0274/3481/articles/LYOFOOD-freeze-dried-organic-beetroot-powders-EU-01.jpg?v=1490710701','thanh long',21000,'21',1,NULL,7),(6,'2023-04-12 11:23:43',0,'https://cdn.shopify.com/s/files/1/0274/3481/articles/LYOFOOD-freeze-dried-organic-beetroot-powders-EU-01.jpg?v=1490710701','mít',30000,'21',1,NULL,7),(7,'2023-04-12 11:23:44',0,'https://cdn.shopify.com/s/files/1/0274/3481/articles/LYOFOOD-freeze-dried-organic-beetroot-powders-EU-01.jpg?v=1490710701','sữa tươi',290000,'21',1,NULL,7),(8,'2023-04-12 11:23:47',0,'https://cdn.shopify.com/s/files/1/0274/3481/articles/LYOFOOD-freeze-dried-organic-beetroot-powders-EU-01.jpg?v=1490710701','humberger',42000,'21',1,NULL,1),(9,'2023-04-12 11:23:47',0,'https://cdn.shopify.com/s/files/1/0274/3481/articles/LYOFOOD-freeze-dried-organic-beetroot-powders-EU-01.jpg?v=1490710701','hành tím',3000,'21',1,NULL,1),(10,'2023-04-12 11:23:48',0,'https://cdn.shopify.com/s/files/1/0274/3481/articles/LYOFOOD-freeze-dried-organic-beetroot-powders-EU-01.jpg?v=1490710701','khổ qua',7000,'21',1,NULL,1),(11,'2023-04-12 11:23:52',0,'https://cdn.shopify.com/s/files/1/0274/3481/articles/LYOFOOD-freeze-dried-organic-beetroot-powders-EU-01.jpg?v=1490710701','chanh leo',15000,'21',1,NULL,2),(12,'2023-04-12 11:23:52',0,'https://cdn.shopify.com/s/files/1/0274/3481/articles/LYOFOOD-freeze-dried-organic-beetroot-powders-EU-01.jpg?v=1490710701','đậu nành',18000,'21',1,NULL,2),(13,'2023-04-12 11:23:56',0,'https://cdn.shopify.com/s/files/1/0274/3481/articles/LYOFOOD-freeze-dried-organic-beetroot-powders-EU-01.jpg?v=1490710701','thịt bò',180000,'21',1,NULL,3),(14,'2023-04-12 11:23:56',0,'https://cdn.shopify.com/s/files/1/0274/3481/articles/LYOFOOD-freeze-dried-organic-beetroot-powders-EU-01.jpg?v=1490710701','thịt cừu',250000,'21',1,NULL,3),(15,'2023-04-12 11:23:56',0,'https://cdn.shopify.com/s/files/1/0274/3481/articles/LYOFOOD-freeze-dried-organic-beetroot-powders-EU-01.jpg?v=1490710701','đùi gà KFC',23000,'21',1,NULL,3),(16,'2023-04-14 10:25:55',0,'https://cdn.shopify.com/s/files/1/0274/3481/articles/LYOFOOD-freeze-dried-organic-beetroot-powders-EU-01.jpg?v=1490710701','cánh gà',18000,'22',1,NULL,3),(17,'2023-04-14 10:30:20',0,'https://cdn.shopify.com/s/files/1/0274/3481/articles/LYOFOOD-freeze-dried-organic-beetroot-powders-EU-01.jpg?v=1490710701','chân gà',6500,'22',1,NULL,3),(18,'2023-04-14 10:49:28',0,'https://cdn.shopify.com/s/files/1/0274/3481/articles/LYOFOOD-freeze-dried-organic-beetroot-powders-EU-01.jpg?v=1490710701','hành tây',3500,'22',1,NULL,6),(19,'2023-04-14 10:50:19',0,'https://cdn.shopify.com/s/files/1/0274/3481/articles/LYOFOOD-freeze-dried-organic-beetroot-powders-EU-01.jpg?v=1490710701','hành tây',7500,'22',1,NULL,6),(20,'2023-04-14 11:29:37',0,'https://cdn.shopify.com/s/files/1/0274/3481/articles/LYOFOOD-freeze-dried-organic-beetroot-powders-EU-01.jpg?v=1490710701','hành tây2',10000,'22',1,NULL,6),(21,'2023-04-14 11:30:28',0,'https://cdn.shopify.com/s/files/1/0274/3481/articles/LYOFOOD-freeze-dried-organic-beetroot-powders-EU-01.jpg?v=1490710701','hành tây2',12000,'22',1,NULL,6),(22,'2023-04-14 13:09:14',0,'https://cdn.shopify.com/s/files/1/0274/3481/articles/LYOFOOD-freeze-dried-organic-beetroot-powders-EU-01.jpg?v=1490710701','hành tây 22',11000,'22',1,NULL,6),(23,'2023-04-14 13:09:25',0,'https://cdn.shopify.com/s/files/1/0274/3481/articles/LYOFOOD-freeze-dried-organic-beetroot-powders-EU-01.jpg?v=1490710701','hành tây 22',13000,'22',1,NULL,6),(24,'2023-04-14 13:09:57',0,'https://cdn.shopify.com/s/files/1/0274/3481/articles/LYOFOOD-freeze-dried-organic-beetroot-powders-EU-01.jpg?v=1490710701','hành tây 22',14000,'22',1,NULL,6),(25,'2023-04-14 13:12:34',0,'https://cdn.shopify.com/s/files/1/0274/3481/articles/LYOFOOD-freeze-dried-organic-beetroot-powders-EU-01.jpg?v=1490710701','hành tây 22',15000,'22',1,NULL,6),(26,'2023-04-14 13:13:11',0,'https://cdn.shopify.com/s/files/1/0274/3481/articles/LYOFOOD-freeze-dried-organic-beetroot-powders-EU-01.jpg?v=1490710701','hành tây 22',16000,'22',1,NULL,6),(27,'2023-04-14 13:13:38',0,'https://cdn.shopify.com/s/files/1/0274/3481/articles/LYOFOOD-freeze-dried-organic-beetroot-powders-EU-01.jpg?v=1490710701','hành tây 22',28000,'22',1,NULL,6),(28,'2023-04-14 13:13:42',0,'https://cdn.shopify.com/s/files/1/0274/3481/articles/LYOFOOD-freeze-dried-organic-beetroot-powders-EU-01.jpg?v=1490710701','hành tây 22',30000,'22',1,NULL,6),(29,'2023-04-14 13:13:43',0,'https://cdn.shopify.com/s/files/1/0274/3481/articles/LYOFOOD-freeze-dried-organic-beetroot-powders-EU-01.jpg?v=1490710701','hành tây 22',27000,'22',1,NULL,6),(30,'2023-04-14 13:13:49',0,'https://cdn.shopify.com/s/files/1/0274/3481/articles/LYOFOOD-freeze-dried-organic-beetroot-powders-EU-01.jpg?v=1490710701','hành tây 22',24000,'22',1,NULL,6),(31,'2023-04-14 13:15:37',0,'https://cdn.shopify.com/s/files/1/0274/3481/articles/LYOFOOD-freeze-dried-organic-beetroot-powders-EU-01.jpg?v=1490710701','hành tây 223',12000,'22',1,NULL,6),(32,'2023-04-14 13:16:19',0,'https://cdn.shopify.com/s/files/1/0274/3481/articles/LYOFOOD-freeze-dried-organic-beetroot-powders-EU-01.jpg?v=1490710701','hành tây 223',18000,'22',1,NULL,6),(33,'2023-04-14 13:27:35',0,'https://cdn.shopify.com/s/files/1/0274/3481/articles/LYOFOOD-freeze-dried-organic-beetroot-powders-EU-01.jpg?v=1490710701','hành tây 2234',8000,'22',1,NULL,6),(34,'2023-04-14 13:29:27',0,'https://cdn.shopify.com/s/files/1/0274/3481/articles/LYOFOOD-freeze-dried-organic-beetroot-powders-EU-01.jpg?v=1490710701','hành tây 2234',4000,'22',1,NULL,6),(35,'2023-04-14 13:32:28',0,'https://cdn.shopify.com/s/files/1/0274/3481/articles/LYOFOOD-freeze-dried-organic-beetroot-powders-EU-01.jpg?v=1490710701','hành tây 2234',6000,'22',1,NULL,6),(36,'2023-04-14 14:20:15',0,'https://cdn.shopify.com/s/files/1/0274/3481/articles/LYOFOOD-freeze-dried-organic-beetroot-powders-EU-01.jpg?v=1490710701','hành tây 5234',10000,'22',1,NULL,6),(37,'2023-04-14 14:21:24',0,'https://cdn.shopify.com/s/files/1/0274/3481/articles/LYOFOOD-freeze-dried-organic-beetroot-powders-EU-01.jpg?v=1490710701','hành tây 5234',7000,'22',1,NULL,6),(38,'2023-04-14 14:22:35',0,'https://cdn.shopify.com/s/files/1/0274/3481/articles/LYOFOOD-freeze-dried-organic-beetroot-powders-EU-01.jpg?v=1490710701','hành tây 5234',5000,'22',1,NULL,6),(39,'2023-04-17 10:19:44',0,'https://cdn.shopify.com/s/files/1/0274/3481/articles/LYOFOOD-freeze-dried-organic-beetroot-powders-EU-01.jpg?v=1490710701','hành tây 234',5000,'22',1,NULL,6),(40,'2023-04-17 10:20:37',0,'https://cdn.shopify.com/s/files/1/0274/3481/articles/LYOFOOD-freeze-dried-organic-beetroot-powders-EU-01.jpg?v=1490710701','hành tây 234',5000,'22',1,NULL,7),(41,'2023-04-18 11:30:46',0,'https://cdn.shopify.com/s/files/1/0274/3481/articles/LYOFOOD-freeze-dried-organic-beetroot-powders-EU-01.jpg?v=1490710701','hành tây 234',27000,'22',1,NULL,7),(42,'2023-04-18 13:13:21',0,'https://cdn.shopify.com/s/files/1/0274/3481/articles/LYOFOOD-freeze-dried-organic-beetroot-powders-EU-01.jpg?v=1490710701','hành lá',28000,'22',1,NULL,7),(43,'2023-04-18 13:30:38',0,'https://cdn.shopify.com/s/files/1/0274/3481/articles/LYOFOOD-freeze-dried-organic-beetroot-powders-EU-01.jpg?v=1490710701','hành lá',28000,'22',1,NULL,10),(44,'2023-04-18 13:31:14',0,'https://cdn.shopify.com/s/files/1/0274/3481/articles/LYOFOOD-freeze-dried-organic-beetroot-powders-EU-01.jpg?v=1490710701','hành lá',28000,'22',1,NULL,10),(45,'2023-04-18 13:34:32',0,'https://cdn.shopify.com/s/files/1/0274/3481/articles/LYOFOOD-freeze-dried-organic-beetroot-powders-EU-01.jpg?v=1490710701','hành lá',28000,'22',1,NULL,10),(46,'2023-04-18 13:47:46',0,'https://cdn.shopify.com/s/files/1/0274/3481/articles/LYOFOOD-freeze-dried-organic-beetroot-powders-EU-01.jpg?v=1490710701','hành lá',28000,'22',1,NULL,10),(47,'2023-04-18 13:47:48',0,'https://cdn.shopify.com/s/files/1/0274/3481/articles/LYOFOOD-freeze-dried-organic-beetroot-powders-EU-01.jpg?v=1490710701','hành lá',28000,'22',1,NULL,10),(48,'2023-04-18 13:54:23',0,'https://cdn.shopify.com/s/files/1/0274/3481/articles/LYOFOOD-freeze-dried-organic-beetroot-powders-EU-01.jpg?v=1490710701','hành lá',28000,'22',1,NULL,10),(49,'2023-04-18 13:55:02',0,'https://cdn.shopify.com/s/files/1/0274/3481/articles/LYOFOOD-freeze-dried-organic-beetroot-powders-EU-01.jpg?v=1490710701','hành lá',28000,'22',1,NULL,10);
/*!40000 ALTER TABLE `product` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `role`
--

DROP TABLE IF EXISTS `role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `role` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `role`
--

LOCK TABLES `role` WRITE;
/*!40000 ALTER TABLE `role` DISABLE KEYS */;
INSERT INTO `role` VALUES (2,'user'),(1,'admin'),(3,'edithor'),(4,'author');
/*!40000 ALTER TABLE `role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `statistical`
--

DROP TABLE IF EXISTS `statistical`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `statistical` (
  `id` int NOT NULL AUTO_INCREMENT,
  `quarterlysales` double DEFAULT NULL,
  `salesbyday` double DEFAULT NULL,
  `salesbymonth` double DEFAULT NULL,
  `salesbyyear` double DEFAULT NULL,
  `order_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKnd4q69o7pwkmwtbmhaitpdjub` (`order_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `statistical`
--

LOCK TABLES `statistical` WRITE;
/*!40000 ALTER TABLE `statistical` DISABLE KEYS */;
/*!40000 ALTER TABLE `statistical` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `id` int NOT NULL AUTO_INCREMENT,
  `address` varchar(150) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `sdt` varchar(150) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  `role_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKn82ha3ccdebhokx3a8fgdqeyy` (`role_id`)
) ENGINE=MyISAM AUTO_INCREMENT=24 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'Hà Nội','tuantran2kvip@gmail.com','Tuấn','anhtuan123','0352744465','tuantran2k',1),(2,'Vĩnh Phúc','tuan@gmail.com','Trần Tuấn','anhtuan123','0327156465','trantuan',2),(8,'Vĩnh Phúc','dsjdas','Tuấn Trần','$2a$10$vgXMZQ38mzevSG/xC7R1XuDGV.RZGNJ0GJFxyyHFDe2BVGbyUkV7u',NULL,'anhtuan123',2),(9,'Vĩnh Phúc','dsjdas','Tuấn Trần','$2a$10$gIKGFELXdvkvs6r2xrM.w.GjtZGEo4JKyz5BbG257vAwdnqP6.4UG',NULL,'anhtuan123s',2),(10,'Vĩnh Phúc','dsjdas','Tuấn Trần','$2a$10$JGFh2g4UUR5KzDYkB165juTTHn6D/m2uSVBRTpxVZd.dgtdNvIG3a',NULL,'anhtuan123sqưewqew',2),(11,'Vĩnh Phúc','dsjdas','Tuấn Trần','$2a$10$5INRP.rVtdAksWqSEx7GwOGoCgmAIc3PdOwUL3luYnGeHB9S3MiJa',NULL,'anhtuan123sqưewqewưe',1),(12,'Vĩnh Phúc','dsjdas','Tuấn Trần','$2a$10$kc0TPSFqYpE/0pVvTZ2g5uqV5yTkLCEfu7K5Reth2zG0wWXmLAn9G',NULL,'hahaha',1),(13,'Vĩnh Phúc','dsjdas','Tuấn Trần','$2a$10$dY7EvwxH1CJG61R9/wS3qO4IJzdPg.Y7Eza36F4XJVjdDArr9NW66',NULL,'hahaha1',1),(14,'Vĩnh Phúc','dsjdas','Tuấn Trần','$2a$10$luouSRDWdAfHmdgWtHV/Z.UXqPg2cNcD6TIYf51KslUyVfRIBnJim',NULL,'hahaha12',1),(15,'Vĩnh Phúc','0352744465','Tuấn Trần','$2a$10$zlPFzBGz03aoTDuf5C/C9.nrQSJzIs2PtWoYtEKD0GYRoMVfmgas.','dsjdas','hahaha1223',1),(16,'Vĩnh Phúc','0352744465','Tuấn Trần','$2a$10$P9ou3cH4ZKWJSLCo.Kjk3.Ucw5WcGciZOPsVGTE.uR1UJLtuFdqNG','dsjdas','hahaha12qư23',1),(17,'Vĩnh Phúc','dsjdas','Tuấn Trần','$2a$10$4uYO1cgQOCLIHOR.bKZRluKRtQuxpN7c1/qK8nxiLDXeLUcpQcml6','0352744465','haha123',1),(19,'Vĩnh Phúc','fakker2kvip@gmail.com','Trần Ngọc Tuấn','$2a$10$mS9wBY8ZJ2v.kZOATnVQSO6ShXhgFp9s77G7SV2enELcrBav34u46','0352744465','haanhtuan',2),(20,'Vĩnh Phúc','fakker2kvip@gmail.com','Trần Ngọc Tuấn','$2a$10$0HX9ovd1IJkoYN4jIgqDQ.tJSxEL4yIH/kIXuR8USYou65J.310au','0352744465','minhtuan',2),(21,'Vĩnh Phúc','fakker2kvip@gmail.com','Trần Ngọc Tuấn','$2a$10$h0RTpED.h.uexCttlqUSgOhAAvzzGItDhrxjOVfnBtVZogCdXCXfm','0352744465','ngoctuan',2),(22,'Vĩnh Phúc','fakker2kvip@gmail.com','Trần Ngọc Tuấn','$2a$10$rgEnkRUHv1zE901lr4cOOO3k2MGPVT68r2xhKHJew1jA2Fgp1zWYu','0352744465','tuanngoc',2),(23,'Vĩnh Phúc','fakker2kvip@gmail.com','Trần Ngọc Tuấn','$2a$10$LRVdSf2zwVuR32RQ3fsbj.X09UXobKQVDuIo4s7BK5Od5nkRHh8nu','0352744465','tuanngoctran',2);
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'vegetable'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-04-18 17:12:05
