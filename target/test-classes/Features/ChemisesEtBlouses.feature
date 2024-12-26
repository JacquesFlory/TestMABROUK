#Author: Jacques Flory

Feature: Chemises&Blouses

Scenario: Acceder a la page Chemises&Blouses et cliquer sur un produit

Given utilisateur est sur la page "Chemises & Blouses"
When utilisateur clique sur le produit "CHEMISE ISRA"
Then utilisateur est dirige vers la page du produit "CHEMISE ISRA"
