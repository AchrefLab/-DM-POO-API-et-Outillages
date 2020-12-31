Partie 1/2:
    Etape 5:
        1) WEB: Spring Boot est un framework qui facilite le développement d'applications fondées sur Spring en offrant des outils permettant d'obtenir une application packagée en jar , totalement autonome. Ce qui nous intéresse particulièrement, puisque nous essayons de développer des Microservices !
        Source: https://openclassrooms.com/fr/courses/4668056-construisez-des-microservices/5122425-decouvrez-le-framework-spring-boot
        2) JPA: Spring Data JPA, qui fait partie de la plus grande famille Spring Data, facilite la mise en œuvre facile de référentiels basés sur JPA. Ce module traite de la prise en charge améliorée des couches d'accès aux données basées sur JPA. Cela facilite la création d'applications Spring qui utilisent des technologies d'accès aux données.
        Source: https://spring.io/projects/spring-data-jpa
        3)HIBERNATE: Hibernate est un framework open source gérant la persistance des objets en base de données relationnelle
        Source: Wikipedia
        3)H2: H2 est une base de données Java légère et open source. Il peut être intégré dans des applications Java ou s'exécuter en mode client-serveur. Principalement, la base de données H2 peut être configurée pour s'exécuter en tant que base de données en mémoire, ce qui signifie que les données ne persisteront pas sur le disque. En raison de la base de données intégrée, elle n'est pas utilisée pour le développement de la production, mais principalement pour le développement et les tests.
        Source: https://www.tutorialspoint.com/h2_database/h2_database_introduction.htm 
        4)Thymeleaf: Thymeleaf est un moteur de template, sous licence Apache 2.0, écrit en Java pouvant générer du XML/XHTML/HTML5. Thymeleaf peut être utilisé dans un environnement web ou non web. Son but principal est d'être utilisé dans un environnement web pour la génération de vue pour les applications web basées sur le modèle MVC
        Source: https://fr.wikipedia.org/wiki/Thymeleaf

    Etape 13:
        1)getMapping(“/geeting”)  dans "HelloWorldController.java"
        2) return " greeting " dans "HelloWorldController.java"
        3)Le binding se fait avec: 
            greeting(@RequestParam(name="nameGET", required=false, defaultValue="World") String nameGET, Model model) {
            model.addAttribute("nomTemplate", nameGET);
        Puis il le nom est reçu dans le greeting.html avec  ${nomTemplate} 
    
    Etape 17: 
        On remarque la création d'une table avec les attribues id, creation et content
    
    Etape 18:
        La table est créee avec Hibernate en utilisant:
        @Entity @Id @GeneratedValue  dans le address.java

    Etape 20:
    En envoyant une requette SELECT * on remarque l'apparition du contenu introduit dans le fichier data.sql

    Etape 23:
        @AutoWired: La fonction de câblage automatique de Spring Framework vous permet d'injecter implicitement la dépendance d'objet. Il utilise en interne l'injection de setter ou de constructeur. Le câblage automatique ne peut pas être utilisé pour injecter des valeurs primitives et des chaînes. Cela fonctionne uniquement avec référence.
        Source: https://www.javatpoint.com/autowiring-in-spring

    Etape 30:
        Pour ajouter bootstrap dans le projet, on commence par ouvrir le site https://www.bootstrapcdn.com/ et choisir un modèle (template) et finalement copier le lien css à introduire dans le fichier html
            <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootswatch/4.5.2/solar/bootstrap.min.css">
        ainsi qu'aux script JS


Partie 2/2:
    Etape 6:
        1) Pour lancer l'api OpenWeatherMap on a besoin d'avoir une clé, elle sera générer après avoir créer un compte le site.
        2)http://api.openweathermap.org/data/2.5/weather?lat=&lon=&appid=clé&units=metric
        3)methode GET
        4) Il exite plusieurs méthodes pour appeler l'api. Avec cet url il faut donner les donner paramètres lat (lantitude) et lon (longitude)

        Pour faire les tests des requetes et visualiser les réponses (Pour determiner les paramètres à récuperer dans le projet) j'ai utilisé la plateforme POSTMAN
        Vous trouverez un document POSTMAN.txt joint à ce projet qui illustre un exemple.


*******************************
Lien GITHUB:
https://github.com/AchrefLab/-DM-POO-API-et-Outillages.git