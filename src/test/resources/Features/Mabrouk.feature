#Author: Jacques Flory

Feature: Mabrouk

Scenario: Page daccueil Mabrouk

Given Utilisateur accede a la page daccueil

When Utilisateur survole la souris sur le menu "Femme"

And Utilisateur clique sur le submenu "Chemises & Blouses"

Then Utilisateur est dirige vers la page du submenu "Chemises & Blouses"
