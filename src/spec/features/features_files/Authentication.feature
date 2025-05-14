Feature: je verifie la page d authentification
  En tant que utilisateur je souhaite m authentifier au site Mercury

  @connexion
  Scenario: je verifie la page d authentification
    Given je me connecte sur l application Mercury
    When je saisi le Username "Test"
    And je saisie le Password "Test"
    And je clique sur le bouton Submit
    Then je me redirige vers la page d acceuil "Login Successfully"
