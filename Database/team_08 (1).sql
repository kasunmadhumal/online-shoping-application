-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Feb 26, 2022 at 02:42 PM
-- Server version: 5.7.31
-- PHP Version: 7.3.21

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `team 08`
--

-- --------------------------------------------------------

--
-- Table structure for table `adimin`
--

DROP TABLE IF EXISTS `adimin`;
CREATE TABLE IF NOT EXISTS `adimin` (
  `username` varchar(40) NOT NULL,
  `password` varchar(40) NOT NULL,
  PRIMARY KEY (`username`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `adimin`
--

INSERT INTO `adimin` (`username`, `password`) VALUES
('admin', 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `cart`
--

DROP TABLE IF EXISTS `cart`;
CREATE TABLE IF NOT EXISTS `cart` (
  `email` varchar(40) NOT NULL,
  `id` varchar(40) NOT NULL,
  `count` int(10) NOT NULL,
  `date` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`email`,`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `cart`
--

INSERT INTO `cart` (`email`, `id`, `count`, `date`) VALUES
('skasunmk98@gmail.com', 'FooGlonikmed', 1, '2022-02-26 19:57:54'),
('skasunmk98@gmail.com', 'arcBowMas-', 1, '2022-02-26 19:38:25'),
('skasunmk98@gmail.com', 'FooShiniksma', 1, '2022-02-26 19:58:01'),
('skasunmk98@gmail.com', 'CheChevil-', 1, '2022-02-26 19:43:26'),
('skasunmk98@gmail.com', 'DarDarMol-', 2, '2022-02-26 19:43:37'),
('skasunmk98@gmail.com', 'CriGrinik-', 2, '2022-02-26 19:42:44');

-- --------------------------------------------------------

--
-- Table structure for table `discounteditems`
--

DROP TABLE IF EXISTS `discounteditems`;
CREATE TABLE IF NOT EXISTS `discounteditems` (
  `id` varchar(60) NOT NULL,
  `discount` double NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `discounteditems`
--

INSERT INTO `discounteditems` (`id`, `discount`) VALUES
('CriBatvillar', 0.05),
('SwiJerMaslar', 0.05),
('CheCheOth-', 0.1),
('GolBatkoo-', 0.1),
('arcBowMas-', 0.05),
('BasBalvil-', 0.25),
('FooShiniklar', 0.5),
('YogYogPumlar', 0.05),
('CriHelMaslar', 0.2),
('CarCarvil-', 0.05),
('CriThiadilar', 0.2),
('GymWeikap5kg', 0.1);

-- --------------------------------------------------------

--
-- Table structure for table `items`
--

DROP TABLE IF EXISTS `items`;
CREATE TABLE IF NOT EXISTS `items` (
  `id` varchar(60) NOT NULL,
  `sportName` varchar(40) NOT NULL,
  `productType` varchar(40) NOT NULL,
  `brand` varchar(20) NOT NULL,
  `size` varchar(12) NOT NULL,
  `prize` int(40) NOT NULL,
  `countOfItems` int(20) NOT NULL,
  `category` varchar(20) NOT NULL,
  `imagePath` varchar(300) NOT NULL,
  `description` varchar(500) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `items`
--

INSERT INTO `items` (`id`, `sportName`, `productType`, `brand`, `size`, `prize`, `countOfItems`, `category`, `imagePath`, `description`) VALUES
('FooBalMol-', 'FootBall', 'Ball', 'Molten', '-', 5200, 5, 'Team Sports', 'src\\\\main\\\\java\\\\com\\\\mycompany\\\\sportsitemapplication\\\\view\\\\img\\\\FooBalMol-.jpg', 'Entry Level Training Footballs made with Imported PVC, Machine Stitched, Soft Touch and available in Vibrant Colors and Designs.'),
('FooBalkap-', 'FootBall', 'Ball', 'kappa', '-', 4800, 5, 'Team Sports', 'src\\\\main\\\\java\\\\com\\\\mycompany\\\\sportsitemapplication\\\\view\\\\img\\\\FooBalkap-.jpg', 'Entry-Level Training Footballs made with Imported PVC, Machine Stitched, Soft Touch and available in Vibrant Colors and Designs.'),
('FooShoPum6', 'FootBall', 'Shoes', 'Puma', '6', 12900, 6, 'Team Sports', 'src\\\\main\\\\java\\\\com\\\\mycompany\\\\sportsitemapplication\\\\view\\\\img\\\\FooShoPum6.jpg', 'Buy high quality football shoes online for best prices. Visit our online store and check the prices of high quality Cosco football shoes for affordable prices. We deliver items to your doorstep'),
('FooShoadi8', 'FootBall', 'Shoes', 'adidas', '8', 14700, 2, 'Team Sports', 'src\\\\main\\\\java\\\\com\\\\mycompany\\\\sportsitemapplication\\\\view\\\\img\\\\FooShoadi8.jpg', 'Buy high quality football shoes online for best prices. Visit our online store and check the prices of high quality Cosco football shoes for affordable prices. We deliver items to your doorstep'),
('FooShoPum5', 'FootBall', 'Shoes', 'Puma', '5', 12500, 1, 'Team Sports', 'src\\\\main\\\\java\\\\com\\\\mycompany\\\\sportsitemapplication\\\\view\\\\img\\\\FooShoPum5.jpg', 'Buy high quality football shoes online for best prices. Visit our online store and check the prices of high quality Cosco football shoes for affordable prices. We deliver items to your doorstep'),
('FooShoadi10', 'FootBall', 'Shoes', 'adidas', '10', 15000, 4, 'Team Sports', 'src\\\\main\\\\java\\\\com\\\\mycompany\\\\sportsitemapplication\\\\view\\\\img\\\\FooShoadi10.jpg', 'Buy high quality football shoes online for best prices. Visit our online store and check the prices of high quality Cosco football shoes for affordable prices. We deliver items to your doorstep'),
('FooGlonikmed', 'FootBall', 'Gloves', 'nike', 'medium', 3100, 2, 'Team Sports', 'src\\\\main\\\\java\\\\com\\\\mycompany\\\\sportsitemapplication\\\\view\\\\img\\\\FooGlonikmed.jpg', 'Buy high quality football gloves online for best prices. Visit our online store and check the prices of high quality Cosco football gloves for affordable prices. We deliver items to your doorstep'),
('FooShinikmed', 'FootBall', 'Shin Guards', 'nike', 'medium', 2300, 0, 'Team Sports', 'src\\\\main\\\\java\\\\com\\\\mycompany\\\\sportsitemapplication\\\\view\\\\img\\\\FooShinikmed.jpg', 'Buy high quality shin guards online for best prices. Visit our online store and check the prices of high quality Cosco shin guards for affordable prices. We deliver items to your doorstep.'),
('FooShiniklar', 'FootBall', 'Shin Guards', 'nike', 'large', 4900, 14, 'For Childs', 'src\\\\main\\\\java\\\\com\\\\mycompany\\\\sportsitemapplication\\\\view\\\\img\\\\FooShiniklar.jpg', 'Buy high quality shin guards online for best prices. Visit our online store and check the prices of high quality Cosco shin guards for affordable prices. We deliver items to your doorstep.'),
('FooShiniksma', 'FootBall', 'Shin Guards', 'nike', 'small', 2700, 18, 'Team Sports', 'src\\\\main\\\\java\\\\com\\\\mycompany\\\\sportsitemapplication\\\\view\\\\img\\\\FooShiniksma.jpg', 'Buy high quality shin guards online for best prices. Visit our online store and check the prices of high quality Cosco shin guards for affordable prices. We deliver items to your doorstep.'),
('FooJerOthmed', 'FootBall', 'Jersey', 'Other', 'medium', 670, 4, 'Team Sports', 'src\\\\main\\\\java\\\\com\\\\mycompany\\\\sportsitemapplication\\\\view\\\\img\\\\FooJerOthmed.jpg', 'Buy high quality football jersey online for best prices. Visit our online store and check the prices of high quality Cosco foot ball jersey for affordable prices. We deliver items to your doorstep.'),
('FooJerOthlar', 'FootBall', 'Jersey', 'Other', 'large', 900, 11, 'Team Sports', 'src\\\\main\\\\java\\\\com\\\\mycompany\\\\sportsitemapplication\\\\view\\\\img\\\\FooJerOthlar.jpg', 'Buy high quality football jersey online for best prices. Visit our online store and check the prices of high quality Cosco foot ball jersey for affordable prices. We deliver items to your doorstep.'),
('FooShoOthlar', 'FootBall', 'Shorts', 'Other', 'large', 590, 8, 'Team Sports', 'src\\\\main\\\\java\\\\com\\\\mycompany\\\\sportsitemapplication\\\\view\\\\img\\\\FooShoOthlar.jpg', 'Buy high quality football shorts online for best prices. Visit our online store and check the prices of high quality Cosco foot ball shorts for affordable prices. We deliver items to your doorstep.'),
('CriHelMasmed', 'Cricket', 'Helmet', 'Masuri', 'medium', 4700, 20, 'Team Sports', 'src\\\\main\\\\java\\\\com\\\\mycompany\\\\sportsitemapplication\\\\view\\\\img\\\\CriHelMasmed.jpg', 'Buy high quality cricket helmet online for best prices. Visit our online store and check the prices of high quality Cosco cricket helmet for affordable prices. We deliver items to your doorstep.'),
('CriHelMaslar', 'Cricket', 'Helmet', 'Masuri', 'large', 6500, 3, 'For Childs', 'src\\\\main\\\\java\\\\com\\\\mycompany\\\\sportsitemapplication\\\\view\\\\img\\\\CriHelMaslar.jpg', 'Buy high quality cricket helmet online for best prices. Visit our online store and check the prices of high quality Cosco cricket helmet for affordable prices. We deliver items to your doorstep.'),
('CriHelOthmed', 'Cricket', 'Helmet', 'Other', 'medium', 3900, 6, 'Team Sports', 'src\\\\main\\\\java\\\\com\\\\mycompany\\\\sportsitemapplication\\\\view\\\\img\\\\CriHelOthmed.jpg', 'Buy high quality cricket helmet online for best prices. Visit our online store and check the prices of high quality Cosco cricket helmet for affordable prices. We deliver items to your doorstep.'),
('CriBatvillar', 'Cricket', 'Batting Gloves', 'vilson', 'large', 4600, 2, 'Team Sports', 'src\\\\main\\\\java\\\\com\\\\mycompany\\\\sportsitemapplication\\\\view\\\\img\\\\CriBatvillar.jpg', 'Gima Batting Inner Cotton Plain is Highest Quality Fingerless Gloves'),
('CriBatvilsma', 'Cricket', 'Batting Gloves', 'vilson', 'small', 4200, 20, 'Team Sports', 'src\\\\main\\\\java\\\\com\\\\mycompany\\\\sportsitemapplication\\\\view\\\\img\\\\CriBatvilsma.jpg', 'Gima Batting Inner Cotton Plain is Highest Quality Fingerless Gloves'),
('CriBatOthmed', 'Cricket', 'Batting Gloves', 'Other', 'medium', 3600, 10, 'Team Sports', 'src\\\\main\\\\java\\\\com\\\\mycompany\\\\sportsitemapplication\\\\view\\\\img\\\\CriBatOthmed.jpg', 'Gima Batting Inner Cotton Plain is Highest Quality Fingerless Gloves'),
('CriThiadilar', 'Cricket', 'Thigh Pads', 'adidas', 'large', 3800, 0, '', 'src\\\\main\\\\java\\\\com\\\\mycompany\\\\sportsitemapplication\\\\view\\\\img\\\\CriThiadilar.jpg', 'Gima Molded Thigh pad Both Side Highest Quality Cricket Thigh Pads'),
('CriThiPumlar', 'Cricket', 'Thigh Pads', 'Puma', 'large', 1800, 0, 'Team Sports', 'src\\\\main\\\\java\\\\com\\\\mycompany\\\\sportsitemapplication\\\\view\\\\img\\\\CriThiPumlar.jpg', 'Gima Molded Thigh pad Both Side Highest Quality Cricket Thigh Pads'),
('CriGriMik-', 'Cricket', 'Grips', 'Mikasa', '-', 550, 40, 'Team Sports', 'src\\\\main\\\\java\\\\com\\\\mycompany\\\\sportsitemapplication\\\\view\\\\img\\\\CriGriMik-.jpg', 'Best Cricket Bat Grips\r\n\r\n– Gripper Design\r\n– Chevron Design\r\n– Scale Design\r\n– Octopus Design with Plain Mix Colors.'),
('CriGrinik-', 'Cricket', 'Grips', 'nike', '-', 600, 71, 'Team Sports', 'src\\\\main\\\\java\\\\com\\\\mycompany\\\\sportsitemapplication\\\\view\\\\img\\\\CriGrinik-.jpg', 'Best Cricket Bat Grips\r\n\r\n– Gripper Design\r\n– Chevron Design\r\n– Scale Design\r\n– Octopus Design with Plain Mix Colors.'),
('CriChekoomed', 'Cricket', 'Chest Guard', 'kookaburra', 'medium', 1360, 5, 'Team Sports', 'src\\\\main\\\\java\\\\com\\\\mycompany\\\\sportsitemapplication\\\\view\\\\img\\\\CriChekoomed.jpg', 'Gima Molded Chest Guard Made from Lightweight Low Density Both Side'),
('CriCheMollar', 'Cricket', 'Chest Guard', 'Molten', 'large', 1500, 5, 'Team Sports', 'src\\\\main\\\\java\\\\com\\\\mycompany\\\\sportsitemapplication\\\\view\\\\img\\\\CriCheMollar.jpg', 'Gima Molded Chest Guard Made from Lightweight Low Density Both Side'),
('CriKeeadilar', 'Cricket', 'Keeping Gloves', 'adidas', 'large', 2300, 4, 'Team Sports', 'src\\\\main\\\\java\\\\com\\\\mycompany\\\\sportsitemapplication\\\\view\\\\img\\\\CriKeeadilar.jpg', 'Dipak Wicket Keeping Inner Cotton Plain is Highest Quality Gloves'),
('CriKeeniklar', 'Cricket', 'Keeping Gloves', 'nike', 'large', 2700, 9, 'Team Sports', 'src\\\\main\\\\java\\\\com\\\\mycompany\\\\sportsitemapplication\\\\view\\\\img\\\\CriKeeniklar.jpg', 'Dipak Wicket Keeping Inner Cotton Plain is Highest Quality Gloves'),
('CriBalkoo-', 'Cricket', 'Ball', 'kookaburra', '-', 3700, 1, 'Team Sports', 'src\\\\main\\\\java\\\\com\\\\mycompany\\\\sportsitemapplication\\\\view\\\\img\\\\CriBalkoo-.jpg', 'Gima Power (RED) Cricket Leather Ball is Highest Quality Ball'),
('BasBalvil-', 'Basket Ball', 'Ball', 'vilson', '-', 8800, 3, 'For Childs', 'src\\\\main\\\\java\\\\com\\\\mycompany\\\\sportsitemapplication\\\\view\\\\img\\\\BasBalvil-.jpg', 'The mikasa Durable and Long Lasting Orange Basketball for all Recreational Play.\r\n\r\nMulti Sizes are Available.'),
('BasBalOth-', 'Basket Ball', 'Ball', 'Other', '-', 4800, 2, 'Team Sports', 'src\\\\main\\\\java\\\\com\\\\mycompany\\\\sportsitemapplication\\\\view\\\\img\\\\BasBalOth-.jpg', 'The mikasa Durable and Long Lasting Orange Basketball for all Recreational Play.\r\n\r\nMulti Sizes are Available.'),
('BasNetPum-', 'Basket Ball', 'Net', 'Puma', '-', 900, 1, 'Team Sports', 'src\\\\main\\\\java\\\\com\\\\mycompany\\\\sportsitemapplication\\\\view\\\\img\\\\BasNetPum-.jpg', 'Basketball Net. Thick Colour, P.P. Silky Finish Net.'),
('BasShonik8', 'Basket Ball', 'Shoes', 'nike', '8', 15000, 8, 'Team Sports', 'src\\\\main\\\\java\\\\com\\\\mycompany\\\\sportsitemapplication\\\\view\\\\img\\\\BasShonik8.jpg', 'Winmark Basketball Shoes – Highest Quality Lightweight Professional Shoes.'),
('BasJerPumlar', 'Basket Ball', 'Jersey', 'Puma', 'large', 780, 2, 'Team Sports', 'src\\\\main\\\\java\\\\com\\\\mycompany\\\\sportsitemapplication\\\\view\\\\img\\\\BasJerPumlar.jpg', 'Buy high quality Basketball jersey online for best prices. Visit our online store and check the prices of high quality Cosco Basketball jersey for affordable prices. We deliver items to your doorstep.'),
('BasJerMikmed', 'Basket Ball', 'Jersey', 'Mikasa', 'medium', 670, 0, 'Team Sports', 'src\\\\main\\\\java\\\\com\\\\mycompany\\\\sportsitemapplication\\\\view\\\\img\\\\BasJerMikmed.jpg', 'Buy high quality Basketball jersey online for best prices. Visit our online store and check the prices of high quality Cosco Basketball jersey for affordable prices. We deliver items to your doorstep.'),
('BatRacadi-', 'Batminton', 'Racket', 'adidas', '-', 6000, 8, 'Team Sports', 'src\\\\main\\\\java\\\\com\\\\mycompany\\\\sportsitemapplication\\\\view\\\\img\\\\BatRacadi-.jpg', 'Included: Turbo – 2 rackets, 6 Shuttles, and badminton net. Home Use Only, Not Branded'),
('BatRacnik-', 'Batminton', 'Racket', 'nike', '-', 3500, 3, 'Team Sports', 'src\\\\main\\\\java\\\\com\\\\mycompany\\\\sportsitemapplication\\\\view\\\\img\\\\BatRacnik-.jpg', 'Included: Turbo – 2 rackets, 6 Shuttles, and badminton net. Home Use Only, Not Branded'),
('BatShuMik-', 'Batminton', 'Shuttlecock', 'Mikasa', '-', 400, 2, 'Team Sports', 'src\\\\main\\\\java\\\\com\\\\mycompany\\\\sportsitemapplication\\\\view\\\\img\\\\BatShuMik-.jpg', 'Buy High Quality Badminton Shuttlecock and Badminton Accessories Online. Visit our online store and order high quality badminton shuttlecock and other Badminton Accessories online. We deliver items to your doorstep.'),
('NetBaladi-', 'NetBall', 'Ball', 'adidas', '-', 5700, 3, 'Team Sports', 'src\\\\main\\\\java\\\\com\\\\mycompany\\\\sportsitemapplication\\\\view\\\\img\\\\NetBaladi-.jpg', 'Entry Level Training Netballs made with Imported PVC, Machine Stitched, Soft Touch and available in Vibrant Colors and Designs.'),
('RugBalMik-', 'Rugby', 'Ball', 'Mikasa', '-', 5800, 4, 'Team Sports', 'src\\\\main\\\\java\\\\com\\\\mycompany\\\\sportsitemapplication\\\\view\\\\img\\\\RugBalMik-.jpg', 'Entry Level Training Rugby made with Imported PVC, Machine Stitched, Soft Touch and available in Vibrant Colors and Designs.'),
('RugJerkapmed', 'Rugby', 'Jersey', 'kappa', 'medium', 2300, 1, 'Team Sports', 'src\\\\main\\\\java\\\\com\\\\mycompany\\\\sportsitemapplication\\\\view\\\\img\\\\RugJerkapmed.jpg', 'Buy high quality Rugby jersey online for best prices. Visit our online store and check the prices of high quality Cosco Rugby jersey for affordable prices. We deliver items to your doorstep.'),
('WatBalMik-', 'Water Polo', 'Ball', 'Mikasa', '-', 3400, 7, 'Team Sports', 'src\\\\main\\\\java\\\\com\\\\mycompany\\\\sportsitemapplication\\\\view\\\\img\\\\WatBalMik-.jpg', 'Entry Level Training waterpolo made with Imported PVC, Machine Stitched, Soft Touch and available in Vibrant Colors and Designs.'),
('HanBalPum-', 'HandBall', 'Ball', 'Puma', '-', 3400, 6, 'Team Sports', 'src\\\\main\\\\java\\\\com\\\\mycompany\\\\sportsitemapplication\\\\view\\\\img\\\\HanBalPum-.jpg', 'Entry Level Training handballball made with Imported PVC, Machine Stitched, Soft Touch and available in Vibrant Colors and Designs.'),
('VbaBalMik-', 'Vball', 'Ball', 'Mikasa', '-', 4500, 5, 'Team Sports', 'src\\\\main\\\\java\\\\com\\\\mycompany\\\\sportsitemapplication\\\\view\\\\img\\\\VbaBalMik-.jpg', 'The eight panel design allows the fingers more surface contact for better sets and passing. Official size and weight.'),
('VbaNetPum-', 'Vball', 'Net', 'Puma', '-', 2300, 5, 'Team Sports', 'src\\\\main\\\\java\\\\com\\\\mycompany\\\\sportsitemapplication\\\\view\\\\img\\\\VbaNetPum-.jpg', '– Simple and portable\r\n– Standard sports volleyball net, size 9.5 m x 1 m.\r\n– Color: White\r\n– Material: PE, four-sided thickened canvas, beautiful and durable.\r\n– The wire rope runs directly through the net and can be used directly on the grid.\r\n– It is resistant to weathering and is sun proof and rainproof for competition and training.\r\n– Suitable for outdoor games with family or friends anytime, anywhere.'),
('VbaKnenik-', 'Vball', 'Knee Gaurd', 'nike', '-', 1600, 8, 'Team Sports', 'src\\\\main\\\\java\\\\com\\\\mycompany\\\\sportsitemapplication\\\\view\\\\img\\\\VbaKnenik-.jpg', 'To therapy and velication you knee. Provide under prop and protect your muscle. Easy to wear, suitable for any sports.'),
('VbaShonikmed', 'Vball', 'Shorts', 'nike', 'medium', 750, 2, 'Team Sports', 'src\\\\main\\\\java\\\\com\\\\mycompany\\\\sportsitemapplication\\\\view\\\\img\\\\VbaShonikmed.jpg', 'Buy high quality volleyball shorts online for best prices. Visit our online store and check the prices of high quality Cosco volleyball shorts for affordable prices. We deliver items to your doorstep.'),
('SwiJerMaslar', 'Swiming', 'Jersey', 'Masuri', 'large', 5300, 0, 'Running and Fitness', 'src\\\\main\\\\java\\\\com\\\\mycompany\\\\sportsitemapplication\\\\view\\\\img\\\\SwiJerMaslar.jpg', 'Buy high quality swiming jersey online for best prices. Visit our online store and check the prices of high quality Cosco swimming jersey for affordable prices. We deliver items to your doorstep.'),
('AthShonikext', 'Athlatic', 'Shorts', 'nike', 'extra large', 560, 4, 'Running and Fitness', 'src\\\\main\\\\java\\\\com\\\\mycompany\\\\sportsitemapplication\\\\view\\\\img\\\\AthShonikext.jpg', 'Buy high quality Athlatic shorts online for best prices. Visit our online store and check the prices of high quality Cosco Athlatic shorts for affordable prices. We deliver items to your doorstep.'),
('AthJerFrasma', 'Athlatic', 'Jersey', 'Franklin', 'small', 950, 4, 'Running and Fitness', 'src\\\\main\\\\java\\\\com\\\\mycompany\\\\sportsitemapplication\\\\view\\\\img\\\\AthJerFrasma.jpg', 'Buy high quality Athlatic jersey online for best prices. Visit our online store and check the prices of high quality Cosco Athlatic jersey shorts for affordable prices. We deliver items to your doorstep.'),
('GymWeikap5kg', 'Gym items', 'Weight Plate', 'kappa', '5kg', 1500, 8, 'Running and Fitness', 'src\\\\main\\\\java\\\\com\\\\mycompany\\\\sportsitemapplication\\\\view\\\\img\\\\GymWeikap5kg.jpg', 'weight platter target specific muscle group exercises or a full body workout'),
('BoxGloPumlar', 'Boxing', 'Gloves', 'Puma', 'large', 4000, 3, 'Running and Fitness', 'src\\\\main\\\\java\\\\com\\\\mycompany\\\\sportsitemapplication\\\\view\\\\img\\\\BoxGloPumlar.jpg', 'Dipak Supremo Boxing Gloves is Highest Quality Gloves'),
('KarJerFralar', 'Karate', 'Jersey', 'Franklin', 'large', 4800, 2, 'Running and Fitness', 'src\\\\main\\\\java\\\\com\\\\mycompany\\\\sportsitemapplication\\\\view\\\\img\\\\KarJerFralar.jpg', 'Buy high-quality karate jerseys online for the best prices. Visit our online store and check the prices of high-quality Cosco karate jerseys for affordable prices. We deliver items to your doorstep.'),
('CheChevil-', 'Chess', 'Chess Board', 'vilson', '-', 800, 5, 'Home Play', 'src\\\\main\\\\java\\\\com\\\\mycompany\\\\sportsitemapplication\\\\view\\\\img\\\\CheChevil-.jpg', 'Child’s Intelligence High Class Chess Set.\r\nisland wide delivery.'),
('CheCheOth-', 'Chess', 'Chess Board', 'Other', '-', 3200, 7, 'Home Play', 'src\\\\main\\\\java\\\\com\\\\mycompany\\\\sportsitemapplication\\\\view\\\\img\\\\CheCheOth-.jpg', 'Child’s Intelligence High Class Chess Set.\r\nisland wide delivery.'),
('CarCarvil-', 'Carrom', 'Carrom Board', 'vilson', '-', 5400, 3, 'Home Play', 'src\\\\main\\\\java\\\\com\\\\mycompany\\\\sportsitemapplication\\\\view\\\\img\\\\CarCarvil-.jpg', 'Champion Carrom Board\r\n\r\n❤ English birch plywood\r\n✅ 16mm,20mm,22mm plywood thickness available\r\n✅ scratch resistan/ water proof /Extra smoothly plywood\r\n✅ All island dilivery available(price without courier charge)\r\n✅ High quality product\r\n✅ Made in sri lanka\r\n✅ Extra smoothly plywood\r\n✅ Playing surface = 29 *29 inch\r\n✅ International carrom federation standed sizes'),
('DarDarMol-', 'Dart Game', 'Dart Game Board', 'Molten', '-', 6700, 3, 'Home Play', 'src\\\\main\\\\java\\\\com\\\\mycompany\\\\sportsitemapplication\\\\view\\\\img\\\\DarDarMol-.jpg', 'Sports Dart Board – Manufactured from the highest quality (Wooden) Material'),
('YogYogPumlar', 'Yoga', 'Yoga Mat', 'Puma', 'large', 3400, 3, 'Home Play', 'src\\\\main\\\\java\\\\com\\\\mycompany\\\\sportsitemapplication\\\\view\\\\img\\\\YogYogPumlar.jpg', 'Yoga Mat or Gym Mat with Cover – Exercise Mattress 4MM & 6MM'),
('ScrScrkap-', 'Scrabble', 'Scrabble Board', 'kappa', '-', 2300, 2, 'Home Play', 'src\\\\main\\\\java\\\\com\\\\mycompany\\\\sportsitemapplication\\\\view\\\\img\\\\ScrScrkap-.jpg', 'Scrabble Game Original Mattel – Best Quality Scrabble Set.'),
('GolBatkoo-', 'Golf', 'Bat', 'kookaburra', '-', 16000, 6, 'Other', 'src\\\\main\\\\java\\\\com\\\\mycompany\\\\sportsitemapplication\\\\view\\\\img\\\\GolBatkoo-.jpg', 'higth qualtity Golf bat in our store. also you can buy it online and we delivery you buyed items.'),
('GolBalkoo-', 'Golf', 'Ball', 'kookaburra', '-', 3400, 7, 'Other', 'src\\\\main\\\\java\\\\com\\\\mycompany\\\\sportsitemapplication\\\\view\\\\img\\\\GolBalkoo-.jpg', 'Gima Power (RED) Cricket Leather Ball is Highest Quality Ball'),
('arcBowMas-', 'archery', 'Bow and Arrows', 'Masuri', '-', 11000, 0, 'Other', 'src\\\\main\\\\java\\\\com\\\\mycompany\\\\sportsitemapplication\\\\view\\\\img\\\\arcBowMas-.jpg', 'You can buy a online good quality archery items in our store and we delivery these items your home within two days. these items made in china ');

-- --------------------------------------------------------

--
-- Table structure for table `sales`
--

DROP TABLE IF EXISTS `sales`;
CREATE TABLE IF NOT EXISTS `sales` (
  `id` varchar(30) NOT NULL,
  `count` int(20) NOT NULL,
  `price` int(20) NOT NULL,
  `email` varchar(40) NOT NULL,
  `soldDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `sales`
--

INSERT INTO `sales` (`id`, `count`, `price`, `email`, `soldDate`) VALUES
('FooShoadi8', 2, 14700, 'vimukthi@gmail.com', '2021-09-24 02:58:12'),
('FooShoPum6', 1, 12900, 'sm@gmail.com', '2021-09-24 02:58:12'),
('FooBalMol-', 1, 5200, 'mithun@gmail.com', '2021-09-24 02:58:12'),
('FooBalMol-', 1, 5200, 'sm@gmail.com', '2021-09-23 16:22:54'),
('FooGlonikmed', 2, 3100, 'noshan@gmail.com', '2021-09-24 02:58:12'),
('FooShiniklar', 2, 2900, 'hiruni@gmail.com', '2021-09-24 02:58:12'),
('FooJerOthlar', 1, 900, 'supuni@gmail.com', '2021-09-24 02:58:12'),
('CriHelMasmed', 1, 4700, 'sheshad@gmail.com', '2021-09-24 02:58:12'),
('CriHelOthmed', 1, 3900, 'tharindu@gmail.com', '2021-09-24 02:58:12'),
('CriThiPumlar', 1, 1800, 'manjula@gmail.com', '2021-09-24 02:58:12'),
('CriBatvillar', 2, 4600, 'sheshad@gmail.com', '2021-09-24 02:58:12'),
('CriThiadilar', 2, 1600, 'sadisna@gmail.com', '2021-09-24 02:58:12'),
('CriCheMollar', 2, 1600, 'rajitha@gmail.com', '2021-09-24 02:58:12'),
('BasNetPum-', 2, 900, 'yashodara@gmail.com', '2021-09-24 02:58:12'),
('BasBalvil-', 1, 6800, 'heshan@gmail.com', '2021-09-24 02:58:12'),
('RugBalMik-', 1, 5800, 'danushi@gmail.com', '2021-09-24 02:58:12'),
('NetBaladi-', 1, 5700, 'tharindu@gmail.com', '2021-09-24 02:58:12'),
('VbaBalMik', 2, 4500, 'sisitha@gmail.com', '2021-09-24 02:58:12'),
('RugJerkapmed', 1, 2300, 'pubudu@gmail.com', '2021-09-24 02:58:12'),
('HanBalPum-', 1, 3400, 'nimantha@gmail.com', '2021-09-24 02:58:12'),
('WatBalMik', 1, 3400, 'malshani@gmail.com', '2021-09-24 02:58:12'),
('SwiJerMaslar', 1, 5300, 'yasiru@gmail.com', '2021-09-24 03:11:28'),
('AthShonikext', 1, 560, 'skasunmk98@gmail.com', '2021-09-24 03:11:28'),
('AthJerFrasma', 2, 1900, 'heshan@gmail.com', '2021-09-24 03:11:28'),
('GymWeikap5kg', 1, 1500, 'danushi@gmail.com', '2021-09-24 03:11:28'),
('BoxGloPumlar', 1, 4000, 'tharindu@gmail.com', '2021-09-24 03:11:28'),
('KarJerFralar', 1, 4800, 'malshani@gmail.com', '2021-09-24 03:11:28'),
('CheChevil-', 1, 800, 'sisitha@gmail.com', '2021-09-24 03:11:28'),
('CheCheOth-', 1, 3200, 'nimantha@gmail.com', '2021-09-24 03:11:28'),
('CarCarvil-', 1, 5400, 'sadisna@gmail.com', '2021-09-24 03:11:28'),
('DarDarMol-', 1, 6700, 'yasiru@gmail.com', '2021-09-24 03:11:28'),
('YogYogPumlar', 1, 3400, 'hiruni@gmail.com', '2021-09-24 03:11:28'),
('ScrScrkap-', 1, 2300, 'rajitha@gmail.com', '2021-09-24 03:11:28'),
('GolBatkoo-', 1, 16000, 'supuni@gmail.com', '2021-09-24 03:11:28'),
('GolBalkoo-', 2, 6800, 'pubudu@gmail.com', '2021-09-24 03:11:28'),
('arcBowMas-', 1, 11000, 'mithun@gmail.com', '2021-09-24 03:11:28'),
('BasBalvil-', 2, 13600, 'skasunmk982@gmail.com', '2021-09-30 10:11:15'),
('GolBatkoo-', 1, 16000, 'skasunmk982@gmail.com', '2021-09-30 10:11:15'),
('CriKeeadilar', 1, 2300, 'skasunmk982@gmail.com', '2021-09-30 10:13:10'),
('FooShoadi10', 1, 15000, 'skasunmk982@gmail.com', '2021-09-30 10:13:10'),
('FooShiniklar', 4, 11600, 'skasunmk982@gmail.com', '2021-09-30 10:15:46'),
('FooShinikmed', 1, 2300, 'skasunmk982@gmail.com', '2021-09-30 10:15:46'),
('FooShinikmed', 1, 2300, 'skasunmk982@gmail.com', '2021-09-30 10:19:28'),
('FooShiniksma', 1, 2700, 'skasunmk982@gmail.com', '2021-09-30 10:19:28'),
('CriThiadilar', 1, 1600, 'skasunmk982@gmail.com', '2021-09-30 10:20:25'),
('FooShoadi10', 1, 15000, 'skasunmk982@gmail.com', '2021-09-30 10:20:25'),
('CriThiadilar', 2, 3200, 'mekaladahanayaka80@gmail.com', '2021-09-30 11:50:41'),
('BatRacadi-', 2, 12000, 'codeforce186@gmail.com', '2021-09-30 12:30:27'),
('CriThiadilar', 1, 1600, 'codeforce186@gmail.com', '2021-09-30 12:30:27'),
('BoxGloPumlar', 2, 8000, 'skasunmk982@gmail.com', '2021-09-30 18:37:14'),
('FooShoPum6', 1, 12900, 'skasunmk982@gmail.com', '2021-09-30 18:37:14'),
('HanBalPum-', 1, 3400, 'skasunmk982@gmail.com', '2021-09-30 18:37:14'),
('BatRacadi-', 1, 6000, 'skasunmk982@gmail.com', '2021-09-30 18:50:51'),
('CriThiadilar', 1, 1600, 'skasunmk982@gmail.com', '2021-09-30 18:50:51'),
('SwiJerMaslar', 1, 5300, 'skasunmk982@gmail.com', '2021-09-30 19:16:17'),
('CriKeeadilar', 1, 2300, 'skasunmk982@gmail.com', '2021-10-01 07:54:19'),
('CheCheOth-', 1, 3200, 'skasunmk98@gmail.com', '2021-10-05 13:05:09'),
('BasShonik8', 1, 15000, 'skasunmk982@gmail.com', '2022-01-10 19:44:21'),
('CriGriMik-', 4, 2200, 'nimanthagayan0309@gmail.com', '2022-01-11 11:00:35'),
('CriHelMaslar', 3, 15900, 'nimanthagayan0309@gmail.com', '2022-01-11 11:00:35'),
('ScrScrkap-', 1, 2300, 'skasunmk982@gmail.com', '2022-01-12 05:36:07'),
('VbaNetPum-', 2, 4600, 'skasunmk982@gmail.com', '2022-01-12 05:36:07'),
('CriBatOthmed', 1, 3600, 'skasunmk982@gmail.com', '2022-01-12 05:47:03'),
('CriKeeniklar', 2, 5400, 'skasunmk982@gmail.com', '2022-01-12 05:47:03'),
('BasBalvil-', 2, 13600, 'skasunmk982@gmail.com', '2022-01-12 15:26:48'),
('VbaKnenik-', 1, 1600, 'skasunmk982@gmail.com', '2022-01-12 15:26:48'),
('CriBatvillar', 1, 4600, 'skasunmk982@gmail.com', '2022-01-12 15:55:07'),
('CriHelMaslar', 6, 31800, 'skasunmk982@gmail.com', '2022-01-12 15:55:07'),
('CriHelOthmed', 1, 3900, 'skasunmk982@gmail.com', '2022-01-12 15:55:07'),
('VbaBalMik-', 4, 18000, 'skasunmk982@gmail.com', '2022-01-12 15:55:07'),
('CriHelOthmed', 1, 3900, 'skasunmk982@gmail.com', '2022-01-13 03:09:28'),
('FooShiniklar', 2, 5800, 'skasunmk982@gmail.com', '2022-01-13 03:09:28'),
('CriBatvillar', 2, 9200, 'skasunmk98@gmail.com', '2022-01-13 05:38:13');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
CREATE TABLE IF NOT EXISTS `users` (
  `id` int(100) NOT NULL AUTO_INCREMENT,
  `email` varchar(30) NOT NULL,
  `first_name` varchar(40) DEFAULT NULL,
  `last_name` varchar(40) DEFAULT NULL,
  `username` varchar(40) NOT NULL,
  `password` varchar(80) NOT NULL,
  `validation_code` text,
  `active` int(2) DEFAULT NULL,
  `registerDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=56 DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id`, `email`, `first_name`, `last_name`, `username`, `password`, `validation_code`, `active`, `registerDate`) VALUES
(4, 'chaluka@gmail.com', 'chaluka', 'heshan', 'chaluka', '28be88a8302bd2be7e1c4977138d7ae6', '0', 1, '2021-09-23 10:41:20'),
(5, 'thamashi@gmail.com', 'thamashi', 'wickramathunga', 'thamashi wickramathunga', 'c2f13533810d9b6a56ffdc720c94cb4f', '0', 1, '2021-09-23 10:42:05'),
(6, 'hiruni@gmail.com', 'hiruni', 'dhanayaka', 'hiruni dahanayaka', '10600d77625e6bb1c71f307929b47cf7', '0', 1, '2021-09-23 10:42:38'),
(7, 'yashodara@gmail.com', 'yashodara', 'devindi', 'yashodara', 'f07e7b925bcf8a58e918e3fecd5c0524', '0', 1, '2021-09-23 10:43:14'),
(8, 'mithun@gmail.com', 'mithun', 'thathsaran', 'mithun', 'db413d6fbb1d9d0ced3e178e8adbcd97', '0', 1, '2021-09-23 10:43:45'),
(9, 'noshan@gmail.com', 'noshan', 'perera', 'noshan', '06a65b3512097dc72f180e5b8343c93c', '0', 1, '2021-09-23 10:44:19'),
(10, 'rajitha@gmail.com', 'rajitha', 'supun', 'rajitha', '6c8458ab7768ca278ae6ba8e77899b10', '0', 1, '2021-09-23 10:45:50'),
(11, 'sheshad@gmail.com', 'sheshad', 'mihiranga', 'sheshad', '6499f1a48909dcb83e053c97ed74bae5', '0', 1, '2021-09-23 10:46:41'),
(12, 'vimukthi@gmail.com', 'dilshan', 'kodithuwakku', 'vimukthi', 'edbedfe672d328f053cb741660aace0b', '0', 1, '2021-09-23 10:47:09'),
(13, 'manjula@gmail.com', 'methsara', 'rasidu', 'manjula', '8aa1aad76ec68bbafcb3625ffe7cc22a', '0', 1, '2021-09-23 10:47:37'),
(14, 'sadisna@gmail.com', 'sadisna', 'heendeniya', 'sadisna', 'a7e4fc78c731852c7d5b9a228b5d64ef', '0', 1, '2021-09-23 10:48:29'),
(15, 'danushi@gmail.com', 'danushi', 'damsaraa', 'danushi', 'bfeb88f7e9f62caa52b631925f10f0ed', '0', 1, '2021-09-23 10:48:52'),
(16, 'supuni@gmail.com', 'supuni', 'madhushika', 'supuni', '05b87b1d6fa1f884470d3e62b7ff0490', '0', 1, '2021-09-23 10:51:34'),
(17, 'heshan@gmail.com', 'kavishka', 'heshan', 'heshan', '0186bf338fc6a79be2c29fc1707aa225', '0', 1, '2021-09-23 10:53:12'),
(18, 'tharindu@gmail.com', 'tharindu', 'madwa', 'tharindu', '6368ad93c9fa22ab35bf311477f74bd3', '0', 1, '2021-09-23 10:55:07'),
(19, 'dimuthu@gmail.com', 'dimuth', 'malesha', 'dimuthu', 'b7282e6a99fe58feaeb781bff610f243', '0', 1, '2021-09-23 10:56:11'),
(20, 'malshani@gmail.com', 'malshani', 'dahanayaka', 'malshani', 'a5e368dd93b704041191315ca39d5a1d', '0', 1, '2021-09-23 10:57:23'),
(21, 'pubudu@gmail.com', 'pubudu', 'wickramathunga', 'pubudu', '1b1f881749f75e4c45ccdb37af1f1cc6', '0', 1, '2021-09-23 10:58:18'),
(22, 'nimantha@gmail.com', 'nimantha', 'gayana', 'nimantha gayan', 'cefc10f1447898c039b1f8e00f41c61c', '0', 1, '2021-09-23 10:58:46'),
(23, 'yasiru@gmail.com', 'yasiru', 'perera', 'yasiru', '4186c0b10cbc245a22949e121e0bb601', '0', 1, '2021-09-23 13:02:16'),
(24, 'sisitha@gmail.com', 'sisitha', 'jayawardana', 'sisitha', '593c3139f02fda6de18732c76d5041a4', '0', 1, '2021-09-23 13:05:56'),
(30, 'sisithastuff@gmail.com', 'sisitha', 'jayawardhana', 'sisi', '81dc9bdb52d04dc20036dbd8313ed055', 'ee40712902be55b1c4df9e4e9cbc3d95', 0, '2022-01-05 03:16:53'),
(27, 'codeforce186@gmail.com', 'dilka', 'dushmantha', 'dilkass', '81dc9bdb52d04dc20036dbd8313ed055', '0', 1, '2021-09-30 12:28:36'),
(35, 'mekaladahanayaka80@gmail.com', 'malshani', 'dahanayaka', 'malshani', 'bc9b5c6fd0f69fefa46599e2a6db083e', '173ab8ca9da3229fccb8255836d506c7', 0, '2022-01-10 19:17:48'),
(51, 'skasunmk98@gmail.com', 'john', 'smith', 'john smith', '81dc9bdb52d04dc20036dbd8313ed055', '0', 1, '2022-01-13 05:35:02'),
(45, 'rjmithu7@gmail.com', 'mbbdmjc', 'hc gdmj', 'mdmhsgc', '81dc9bdb52d04dc20036dbd8313ed055', '5ed092aec12ef079051c229e207247b2', 0, '2022-01-12 16:04:22'),
(39, 'nimanthagayan0309@gmail.com', 'Nimantha', 'Gayan', 'Nima', '202cb962ac59075b964b07152d234b70', '0', 1, '2022-01-11 10:55:02'),
(52, 'sana@gmail.com', NULL, NULL, 'sanath', '1234', NULL, NULL, '2022-02-23 13:03:51'),
(53, 'siri@gmail.com', NULL, NULL, 'siril', '1234', NULL, NULL, '2022-02-23 13:05:24'),
(54, 'vij@gmail.com', NULL, NULL, 'vijaya', '1234', NULL, NULL, '2022-02-23 13:09:26'),
(55, 'meka@gmail.com', NULL, NULL, 'mekala', '1234', NULL, NULL, '2022-02-24 06:01:55');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
