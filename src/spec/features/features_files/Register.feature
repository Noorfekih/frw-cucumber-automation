Feature: je verifie la page de register
  En tant que utilisateur je souhaite m inscrire au site Mercury

  @register
  Scenario: je verifie la page de register
    Given je me connecte sur l application Mercury
    When je clique sur le lien REGISTER
    When je saisi le Firstname "nour"
    And je saisie le Lastname "fekih"
    And je saisie le Phone "58366880"
    And je saisie le Email "nour22@gmail.com"
    And je saisie le Adress "bouhjar"
    And je saisie le City "monastir"
    And je saisie le State "monastir"
    And je saisie le PostalCode 5015
    And je saisie le Country "TUNISIA"
    And je saisie le Username "nour"
    And je saisie le Password d inscription "nour@22"
    And je confirme le Password "nour@22"
    And je clique sur le bouton Envoyer
    Then je me redirige vers la page "Register sucess"
