# HealthyLife

![CircleCI](https://img.shields.io/circleci/build/github/FadiAbdelqader/HealthyLife?style=flat) [![Codacy Badge](https://app.codacy.com/project/badge/Grade/1d5b6a1121dd402fbb371c7f5d296d11)](https://www.codacy.com/gh/FadiAbdelqader/HealthyLife/dashboard?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=FadiAbdelqader/HealthyLife&amp;utm_campaign=Badge_Grade)

#

Healthylife, l'application qui vous permettra d'améliorer votre quotidien ! Que vous souhaitiez perdre du poids, en gagner, vous maintenir ou simplement faire attention à votre santé, Healthylife saura vous seduire !

Au programme : 
  - Un agenda qui vous permettra de programmer vos repas et vos séances de sport.
  - Un moyen de consulter le nutriscore et la composition des produits que vous achetez.
  - Des suggestions de repas avec recette.
  - Une compilation mensuelle de vos progrès. 
  - ...


# Set-up base de données

Pour stocker les données, nous utilisons une base de données HyperSQL. Vous trouverez les fichiers necessaires à sa mise en place à la source du projet.
Pour lancer le serveur de BD, placez vous dans le répertoire HSQLDB et tapez la commande suivante : java -cp hsqldb.jar org.hsqldb.Server --database Healthylife
