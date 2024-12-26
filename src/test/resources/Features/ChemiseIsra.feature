#Author: Jacques-FLory

Feature: Choix Chemise Isra

Scenario: Acceder a la page Chemise Isra et faire le choix du produit

Given Utilisateur accede a la page du produit "CHEMISE ISRA"

When Utilisateur fait le choix de la couleur la taillte "M" et clique sur ajouter au panier

Then Utilisateur verifie si le produit choisi avec ses critères est ajoute au panier "Voir Le Panier"
