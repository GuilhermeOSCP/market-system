# Web Service – Banco de Dados de Comércio Eletrônico | Web Service – E-Commerce Database

### Introdução | Introduction:

PT-BR: Este projeto consiste em um software Web service destinado a sistemas de e-comerce baseado em Java, Spring Boot, JPA, Hibernate e PostgreSQL. A aplicação fornece uma visão holistica dos produtos e categorias do mesmo, usuários do sistema e os seus pedidos como também o pagamento e o status do pedido, todos eles podendo ser consutados através do banco de dados PostgreSQL.

EN-US: This project consists of a Web service software for e-commerce systems based on Java, Spring Boot, JPA, Hibernate and PostgreSQL. The application provides a holistic view of products and system categories, system users and their orders as well as payment and order status, all of which can be queried through the PostgreSQL database.

### Instruções Para Inicialização do Software | Software Startup Instructions:

PT-BR: Quando o projeto for baixado e você importar o mesmo em sua IDE (Eu utilizo o Eclipse), espere um momento pois as dependencias serão baixadas automaticamente através do Maven, as mesmas se encontram no arquivo "pom.xml" na pasta principal do projeto caso você queira conferi-las.
Após as dependências serem baixadas, será necessária a instalação do PostgreSQL no seu computador para que o software consiga ser executado corretamente. Tendo o postgree instalado, vá até a pasta "src/main/resources" e procure o arquivo "application-dev.properties", nele contém as configurações de conexão com o banco de dados, altere de acordo com o que você configurou no seu PostgreSQL, lembrando que na primeira linha do arquivo contém "spring.datasource.url=jdbc:postgresql://localhost:5432/springboot_course" sendo que o final "springboot_course" é o nome da database que dei no meu PostgreSQL, substitua para o nome da database para a que você criou no seu banco de dados, a inserção dos dados e tabela são feitas altomaticamente, irei explicar abaixo.
Com a conexão do software estabelecida com a sua base de dados do PostgreSQL, o software pode ser inicializado. A primeira inicialização irá demorar um pouco, visto que o PostgreSQL irá instanciar as tabelas e os dados contidos na mesma sendo que as tabelas se encontram no diretório "src/main/java/com/example/marketsystem/entities/" e os dados das tabelas se encontram na pasta "src/main/java/com/example/marketsystem/config/".

EN-US: When the project is downloaded and you import it into your IDE (I use Eclipse), wait a moment because the dependencies will be automatically downloaded through Maven, they are found in the "pom.xml" file in the main project folder if you want to check them out.
After the dependencies are downloaded, you will need to install PostgreSQL on your computer for the software to run correctly. Having postgree installed, go to the "src/main/resources" folder and look for the "application-dev.properties" file, it contains the database connection settings, change it according to what you have configured in your PostgreSQL, remembering that the first line of the file contains "spring.datasource.url=jdbc:postgresql://localhost:5432/springboot_course" and the end "springboot_course" is the name of the database I gave in my PostgreSQL, substitute for database name for the one you created in your database, the insertion of data and table are done automatically, I will explain below.
Once the software is connected to your PostgreSQL database, the software can be started. The first initialization will take a while, as PostgreSQL will instantiate the tables and the data contained in them and the tables are located in the directory "src/main/java/com/example/marketsystem/entities/" and the data from tables are in the "src/main/java/com/example/marketsystem/config/" folder.

### Observação | Observation:

PT-BR: Você pode usar meu código como base de outro ou utiliza-lo como demonstração, mas gostaria que os devidos creditos fossem dados.

EN-US: You can use my code as a base for another or use it as a demonstration, but I would like the proper credits to be given.
