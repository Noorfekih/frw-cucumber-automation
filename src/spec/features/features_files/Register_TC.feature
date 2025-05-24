Feature: je verifie la page de register
En tant que utilisateur je souhaite m inscrire au site Mercury

  @registred
  Scenario Outline: je verifie la page de register
  Given je me connecte sur l application Mercury
  When je clique sur le lien REGISTER
  And je saisi le Firstname "<FirstName>"
  And je saisie le Lastname "<LastName>"
  And je saisie le Phone "<PhoneNumber>"
  And je saisie le Email "<Email>"
  And je saisie le Adress "<Address>"
  And je saisie le City "<City>"
  And je saisie le Username "<UserName>"
  And je saisie le Password d inscription "<Password>"
  And je confirme le Password "<Password>"
  And je clique sur le bouton Envoyer
  Then je me redirige vers la page "Register sucess"
  
 

    Examples: 
      | FirstName | LastName | PhoneNumber | Email | Address | City | UserName | Password |
      | Nour |     Fekih  | 58366880 | nourfekih22@gmail.com | Bouhjar |Monastir | Nour | nour@22 |
      | Ahmed |     Bouzid | 23658478 | ahmed@gmail.com | Bouhjar |Monastir | ahmed | ahmed@90 |
