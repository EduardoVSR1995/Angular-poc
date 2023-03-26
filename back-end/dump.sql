-- MySQL dump 10.13  Distrib 8.0.32, for Linux (x86_64)
--
-- Host: localhost    Database: location
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
-- Table structure for table `house`
--

DROP TABLE IF EXISTS `house`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `house` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(30) NOT NULL,
  `state` varchar(4) NOT NULL,
  `price` int NOT NULL,
  `location` tinyint(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=81 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `house`
--

LOCK TABLES `house` WRITE;
/*!40000 ALTER TABLE `house` DISABLE KEYS */;
INSERT INTO `house` VALUES (1,'Hotel beautifull','TO',500,0),(2,'Hotel beautifull','TO',500,0),(3,'Hotel beautifull','AC',500,0),(4,'Hotel beautifull','AL',500,0),(5,'Hotel beautifull','AM',500,0),(6,'Hotel beautifull','AP',500,0),(7,'Hotel beautifull','BA',500,0),(8,'Hotel beautifull','CE',500,0),(9,'Hotel beautifull','DF',500,0),(10,'Hotel beautifull','ES',500,0),(11,'Hotel beautifull','GO',500,0),(12,'Hotel beautifull','GO',500,0),(13,'Hotel beautifull','MA',500,0),(14,'Hotel beautifull','MT',500,0),(15,'Hotel beautifull','MS',500,0),(16,'Hotel beautifull','MS',500,0),(17,'Hotel beautifull','MG',500,0),(18,'Hotel beautifull','PA',500,0),(19,'Hotel beautifull','PA',500,0),(20,'Hotel beautifull','PB',500,0),(21,'Hotel beautifull','PR',500,0),(22,'Hotel beautifull','PR',500,0),(23,'Hotel beautifull','PE',500,0),(24,'Hotel beautifull','PE',500,0),(25,'Hotel beautifull','PI',500,0),(26,'Hotel beautifull','PI',500,0),(27,'Hotel beautifull','RJ',500,0),(28,'Hotel beautifull','RJ',500,0),(29,'Hotel beautifull','RN',500,0),(30,'Hotel beautifull','RN',500,0),(31,'Hotel beautifull','RS',500,0),(32,'Hotel beautifull','RS',500,0),(33,'Hotel beautifull','RS',500,0),(34,'Hotel beautifull','RO',500,0),(35,'Hotel beautifull','RO',500,0),(36,'Hotel beautifull','RO',500,0),(37,'Hotel beautifull','RR',500,0),(38,'Hotel beautifull','RR',500,0),(39,'Hotel beautifull','RR',500,0),(40,'Hotel beautifull','RR',500,0),(41,'Hotel beautifull','SC',500,0),(42,'Hotel beautifull','SC',500,0),(43,'Hotel beautifull','SC',500,0),(44,'Hotel beautifull','SC',500,0),(45,'Hotel beautifull','SC',500,0),(46,'Hotel beautifull','SC',500,0),(47,'Hotel beautifull','SC',500,0),(48,'Hotel beautifull','SC',500,0),(49,'Hotel beautifull','SC',500,0),(50,'Hotel beautifull','SC',500,0),(51,'Hotel beautifull','SP',500,0),(52,'Hotel beautifull','SC',500,0),(53,'Hotel beautifull','SC',500,0),(54,'Hotel beautifull','SC',500,0),(55,'Hotel beautifull','SC',500,0),(56,'Hotel beautifull','SC',500,0),(57,'Hotel beautifull','SC',500,0),(58,'Hotel beautifull','SC',500,0),(59,'Hotel beautifull','SC',500,0),(60,'Hotel beautifull','SC',500,0),(61,'Hotel beautifull','SC',500,0),(62,'Hotel beautifull','RR',500,0),(63,'Hotel beautifull','RR',500,0),(64,'Hotel beautifull','RR',500,0),(65,'Hotel beautifull','RR',500,0),(66,'Hotel beautifull','RO',500,0),(67,'Hotel beautifull','RO',500,0),(68,'Hotel beautifull','RO',500,0),(69,'Hotel beautifull','RS',500,0),(70,'Hotel beautifull','RS',500,0),(71,'Hotel beautifull','RS',500,0),(72,'Hotel beautifull','RN',500,0),(73,'Hotel beautifull','RN',500,0),(74,'Hotel beautifull','RJ',500,0),(75,'Hotel beautifull','RJ',500,0),(76,'Hotel beautifull','PI',500,0),(77,'Hotel beautifull','PI',500,0),(78,'Hotel beautifull','PE',500,0),(79,'Hotel beautifull','PE',500,0),(80,'Hotel beautifull','PR',500,0);
/*!40000 ALTER TABLE `house` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `images`
--

DROP TABLE IF EXISTS `images`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `images` (
  `id` int NOT NULL AUTO_INCREMENT,
  `url` text NOT NULL,
  `houseId` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `houseId` (`houseId`),
  CONSTRAINT `images_ibfk_1` FOREIGN KEY (`houseId`) REFERENCES `house` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=81 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `images`
--

LOCK TABLES `images` WRITE;
/*!40000 ALTER TABLE `images` DISABLE KEYS */;
INSERT INTO `images` VALUES (1,'https://img.freepik.com/fotos-gratis/mao-apresentando-modelo-de-casa-para-campanha-de-emprestimo_53876-104970.jpg',1),(2,'https://avatar.freepik.com/2199844-210728105124.jpg',2),(3,'https://img.freepik.com/fotos-gratis/casa-isolada-no-campo_1303-23773.jpg',3),(4,'https://img.freepik.com/fotos-gratis/3d-renderizacao-loft-sala-de-estar-escandinava-com-mesa-de-trabalho-e-estante_105762-2162.jpg',4),(5,'https://img.freepik.com/fotos-gratis/mao-segurando-o-modelo-de-imoveis-e-propriedades-da-casa_53876-129010.jpg',5),(6,'https://avatar.freepik.com/2199844-210728105124.jpg',6),(7,'https://img.freepik.com/fotos-gratis/resumo-borrao-interior-da-sala-de-estar_74190-6327.jpg',7),(8,'https://img.freepik.com/fotos-gratis/casal-feliz-com-as-chaves-do-novo-apartamento_329181-19931.jpg',8),(9,'https://img.freepik.com/fotos-gratis/foto-aproximada-de-uma-pessoa-pensando-em-comprar-ou-vender-uma-casa_181624-24928.jpg',9),(10,'https://avatar.freepik.com/18831218.jpg',10),(11,'https://img.freepik.com/fotos-gratis/3d-renderizacao-loft-sala-de-estar-escandinava-com-mesa-de-trabalho-e-estante_105762-2094.jpg',11),(12,'https://img.freepik.com/fotos-gratis/familia-passando-um-tempo-junta-em-casa_23-2149038325.jpg',12),(13,'https://avatar.cdnpk.net/23.jpg',13),(14,'https://img.freepik.com/fotos-gratis/sala-de-estar-de-luxo-loft-de-renderizacao-3d-com-prateleira-perto-da-mesa-de-jantar_105762-2053.jpg',14),(15,'https://img.freepik.com/fotos-gratis/sala-de-estar-de-luxo-loft-de-renderizacao-3d-com-estante-perto-da-estante_105762-2224.jpg',15),(16,'https://img.freepik.com/fotos-gratis/villa-com-piscina-de-luxo-design-contemporaneo-espetacular-arte-digital-imoveis-casa-e-propriedade-ilustracao-generativa-de-ia_1258-151616.jpg',16),(17,'https://avatar.cdnpk.net/1601695.jpg',17),(18,'https://img.freepik.com/fotos-premium/arquitetura-de-predio-branco-moderno-na-cidade_781284-3701.jpg',18),(19,'https://img.freepik.com/fotos-gratis/foto-aproximada-de-uma-pessoa-pensando-em-comprar-ou-vender-uma-casa_181624-19907.jpg',19),(20,'https://avatar.freepik.com/18831218.jpg',20),(21,'https://img.freepik.com/fotos-gratis/feliz-familia-jovem-afro-americana-comprou-uma-casa-nova_7861-3097.jpg',21),(22,'https://avatar.cdnpk.net/4564335.jpg',22),(23,'https://img.freepik.com/fotos-gratis/bela-foto-de-uma-cozinha-moderna-casa-e-sala-de-jantar_181624-2870.jpg',23),(24,'https://avatar.freepik.com/18831218.jpg',24),(25,'https://img.freepik.com/fotos-gratis/agente-de-corretor-de-imoveis-apresentando-e-consultar-o-cliente-para-tomada-de-decisao-assinar-acordo-de-forma-de-seguro_1150-15023.jpg',25),(26,'https://avatar.cdnpk.net/1409847.jpg',26),(27,'https://img.freepik.com/fotos-premium/renderizacao-3d-de-uma-grande-casa-moderna-contemporanea-em-madeira-e-concreto-no-inicio-da-noite_190619-1492.jpg',27),(28,'https://avatar.freepik.com/19288397.jpg',28),(29,'https://img.freepik.com/fotos-gratis/villa-com-piscina-de-luxo-design-contemporaneo-espetacular-arte-digital-imoveis-casa-e-propriedade-ilustracao-generativa-de-ia_1258-151615.jpg',29),(30,'https://avatar.cdnpk.net/1601695.jpg',30),(31,'https://img.freepik.com/fotos-premium/economizando-dinheiro-para-o-fundo-do-conceito-de-investimentos-imobiliarios-casa-e-moedas-conceito-financeiro_833141-13.jpg',31),(32,'https://img.freepik.com/fotos-premium/renderizacao-3d-de-uma-grande-casa-moderna-contemporanea-em-madeira-e-concreto_190619-1495.jpg',32),(33,'https://avatar.freepik.com/19288397.jpg',33),(34,'https://img.freepik.com/fotos-premium/arquitetura-de-predio-branco-moderno-na-cidade_781284-3702.jpg',34),(35,'https://img.freepik.com/fotos-gratis/vista-3d-da-casa_23-2150150818.jpg',35),(36,'https://avatar.cdnpk.net/23.jpg',36),(37,'https://img.freepik.com/fotos-premium/design-de-interiores-em-casa-na-sala-de-estar-com-cozinha-aberta-na-casa-loft_41487-613.jpg',37),(38,'https://img.freepik.com/fotos-premium/renderizacao-3d-de-uma-grande-casa-moderna-contemporanea-em-madeira-e-concreto_190619-1484.jpg',38),(39,'https://avatar.freepik.com/19288397.jpg',39),(40,'https://img.freepik.com/fotos-gratis/aconchegante-sala-de-estar-de-um-apartamento-moderno_181624-58445.jpg',40),(41,'https://avatar.freepik.com/18831218.jpg',41),(42,'https://img.freepik.com/fotos-premium/o-proprietario-desbloqueia-a-chave-da-casa-da-nova-casa-agentes-imobiliarios-agentes-de-vendas_112699-358.jpg',42),(43,'https://img.freepik.com/fotos-gratis/vista-da-casa-abandonada-e-decadente-na-natureza_23-2150166585.jpg',43),(44,'https://avatar.cdnpk.net/23.jpg',44),(45,'https://img.freepik.com/fotos-gratis/novas-chaves-de-casa-e-plano-de-mesa-com-casal-desfocado_23-2148814388.jpg',45),(46,'https://avatar.cdnpk.net/23.jpg',46),(47,'https://img.freepik.com/fotos-gratis/casa-de-luxo-em-venda-de-imoveis-ou-ia-geradora-de-propriedades_169016-29361.jpg',47),(48,'https://avatar.freepik.com/18089375-210504011245.jpg',48),(49,'https://img.freepik.com/fotos-gratis/pais-e-filhos-sorridentes-de-perfil-completo_23-2148884729.jpg',49),(50,'https://avatar.cdnpk.net/23.jpg',50),(51,'https://img.freepik.com/fotos-premium/casa-moderna-com-ceu_35076-483.jpg',51),(52,'https://img.freepik.com/fotos-gratis/casa-de-campo-com-arvores-verdes_1149-127.jpg',52),(53,'https://avatar.cdnpk.net/1416707.jpg',53),(54,'https://img.freepik.com/fotos-gratis/casal-de-tiro-medio-segurando-uma-pequena-casa_23-2148889746.jpg',54),(55,'https://avatar.cdnpk.net/23.jpg',55),(56,'https://img.freepik.com/fotos-premium/maquete-da-parede-interna-da-sala-de-estar-em-tons-quentes-com-sofa-de-couro-que-fica-atras-da-cozinha-renderizacao-3d_41470-3753.jpg',56),(57,'https://avatar.freepik.com/6999967.jpg',57),(58,'https://img.freepik.com/fotos-gratis/foto-de-baixo-angulo-da-fachada-de-um-edificio-moderno-branco-sob-um-ceu-azul-claro_181624-48219.jpg',58),(59,'https://avatar.freepik.com/18831218.jpg',59),(60,'https://img.freepik.com/fotos-premium/linda-casa-com-arquitetura-minimalista-dia-de-sol_23365-15.jpg',60),(61,'https://img.freepik.com/fotos-gratis/familia-feliz-com-cachorro-se-mudando-para-nova-casa_23-2149749178.jpg',61),(62,'https://avatar.cdnpk.net/23.jpg',62),(63,'https://img.freepik.com/fotos-gratis/mulher-de-tiro-medio-com-casa-branca_23-2148819884.jpg',63),(64,'https://avatar.cdnpk.net/23.jpg',64),(65,'https://img.freepik.com/fotos-gratis/mao-de-uma-mulher-mostrando-as-chaves-do-novo-apartamento_329181-19909.jpg',65),(66,'https://img.freepik.com/fotos-gratis/conceito-de-construcao-com-ferramentas-de-engenharia_1150-17809.jpg',66),(67,'https://avatar.cdnpk.net/1409847.jpg',67),(68,'https://img.freepik.com/fotos-gratis/pessoas-sorridentes-de-baixo-angulo-com-tablet_23-2150225248.jpg',68),(69,'https://avatar.cdnpk.net/23.jpg',69),(70,'https://img.freepik.com/fotos-gratis/casa-modelo-na-planta-do-projeto_273609-16397.jpg',70),(71,'https://img.freepik.com/fotos-gratis/bela-foto-de-uma-cozinha-de-casa-moderna_181624-2943.jpg',71),(72,'https://avatar.freepik.com/18831218.jpg',72),(73,'https://img.freepik.com/fotos-gratis/casa-isolada-no-campo_1303-23772.jpg',73),(74,'https://img.freepik.com/fotos-premium/casa-suburbana-europeia_266732-5574.jpg',74),(75,'https://img.freepik.com/fotos-gratis/familia-movendo-e-usando-caixas_1157-35481.jpg',75),(76,'https://img.freepik.com/fotos-gratis/charmosa-casa-amarela-com-janelas-de-madeira-e-jardim-gramado-verde_181624-8074.jpg',76),(77,'https://avatar.freepik.com/18831218.jpg',77),(78,'https://img.freepik.com/fotos-gratis/sala-iluminada_1203-133.jpg',78),(79,'https://avatar.freepik.com/1581387.jpg',79),(80,'https://img.freepik.com/fotos-gratis/arquitetura-moderna-de-apartamentos_1268-14696.jpg',80);
/*!40000 ALTER TABLE `images` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(30) NOT NULL,
  `email` varchar(30) NOT NULL,
  `cep` int NOT NULL,
  `password` varchar(30) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `email` (`email`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `userHouse`
--

DROP TABLE IF EXISTS `userHouse`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `userHouse` (
  `id` int NOT NULL AUTO_INCREMENT,
  `houseId` int NOT NULL,
  `userId` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `houseId` (`houseId`),
  KEY `userId` (`userId`),
  CONSTRAINT `userHouse_ibfk_1` FOREIGN KEY (`houseId`) REFERENCES `house` (`id`),
  CONSTRAINT `userHouse_ibfk_2` FOREIGN KEY (`userId`) REFERENCES `user` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `userHouse`
--

LOCK TABLES `userHouse` WRITE;
/*!40000 ALTER TABLE `userHouse` DISABLE KEYS */;
/*!40000 ALTER TABLE `userHouse` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-03-26  7:07:23
