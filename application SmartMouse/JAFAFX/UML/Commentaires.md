### Diagrammes de cas d'utilisation
* Le cas d'utilisation _Utiliser la commande_ ne veut rien dire. C'est trop général.
* Les rélations de généralisation ne sont pas justifiées, ni expliquées.
* Le cas d'utilisation _Controler periphérique_ n'est pas clairement expliqué. Est-ce le contrôle de l'ordinateur ou le controle des périphériques connectés à l'ordinateur ? La description textuelle ne permet pas d'éclaircir les choses.
* renommez le cas d'utilisation _Modifier l'interface_ en _Modifier l'interface utilisateur_
* les cas d'utilisation doivent correspondre aux fonctionnalités rendus par le système. Le fait qu'un utilisateur puisse contacter par téléphone à priori ne fait pas partie de ces fonctionnalités, à moins que vous passiez les appels par téléphone se font passer à travers votre application. Mais dans ce dernier cas, vous n'en parlez pas dans la description du sujet. Cela semble donc être un peu déplacé.
* les descriptions textuelles sont trop simples pour pouvoir proposer un diagramme de séquence cohérent.


### Diagramme de classes
* il manque les multiplicités et les noms des rôles.
* le terme "Interface" n'est pas approprié car une interface est une classe abstraite particulière en UML et en programmation en général.
* Beaucoup de méthodes de la classe **Interface** doivent plutôt apparaître ailleurs (par ex. `motDePasseOK()` devrait plutôt être un service de la classe **Ordinateur**)
* À quoi sert la classe **Utilisateur** dans votre modélisation objet ?
* Dans la classe **Périphérique**, à quoi correspondent réellement les deux méthodes indiquées dans votre schéma ? Plus généralement, c'est un quoi un périphérique ? Est-ce une telecommande ou une souris ? Ou bien il s'agit des périphériques potentiellement connectés à l'ordinateur (dans ce cas vous n'en parlez pas dans votre description du sujet). À notre avis, votre téléphone devra contrôler tout ce que peut contrôler une souris ou une telecommande. Mais les périphériques connectés à l'ordinateur sont pilotés et contrôlés par le système d'exploitation de cette ordinateur (et pas par votre téléphone). Peut-être définir **Telecommande** et **Souris** comme des classes filles de la classe Telephone serait plus judicieux.

### Diagrammes de séquence
* pensez à utiliser des blocs `loop` pour les messages qui se répètent
* ça correspond à quoi le retour de message `attendreNouvelleAction()` dans le diagramme de séquence "Contrôler la souris" ?
* la cohérence entre le diagramme de séquence et le diagramme de classes n'est pas faite réellement. On a l'impression que le diagramme de séquence c'est juste la description textuelle du cas d'utilisation correspondant ordonnée de manière chronologique sans réelle correspondance en terme de méthodes des classes du diagramme de classes.
 
### Remarques générales :
 
* pensez à la simulation de votre logiciel sans téléphone, sans programmation Android. Par exemple, dans votre module IHM (M2105) vous pouveez simuler le téléphone comme un élément de votre IHM et son utilisation (déplacer, activer etc.) avec la souris simulerait l'utilisation réelle du téléphone comme souris. En quelque sorte on simule la souris à l'aide de la vraie souris de votre machine. À voir avec vos enseignants d'IHM.
* votre cahier des charges n'est pas suffisamment explicite, d'où la plupart des points de confusion dans votre modélisation.
