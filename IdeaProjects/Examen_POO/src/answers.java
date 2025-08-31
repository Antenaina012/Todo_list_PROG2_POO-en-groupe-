public class answers {
    // -----------------------------------------
// PARTIE 1 : Créer une classe Utilisateur
// -----------------------------------------
    class Utilisateur {
        private String id; // identifiant unique
        private String nomUtilisateur;
        private String email;
        private LocalDate dateCreation;

        public Utilisateur(String id, String nomUtilisateur, String email) {
            this.id = id;
            this.nomUtilisateur = nomUtilisateur;
            this.email = email;
            this.dateCreation = LocalDate.now();
        }

        // Getters, equals (pour comparaison d'utilisateurs), etc.
    }

    // -----------------------------------------
// PARTIE 2 : Héritage - Types d'utilisateurs
// -----------------------------------------
    class UtilisateurStandard extends Utilisateur {
        public UtilisateurStandard(String id, String nomUtilisateur, String email) {
            super(id, nomUtilisateur, email);
        }
    }

    class Moderateur extends UtilisateurStandard {
        public Moderateur(String id, String nomUtilisateur, String email) {
            super(id, nomUtilisateur, email);
        }
    }

    class Administrateur extends Moderateur {
        public Administrateur(String id, String nomUtilisateur, String email) {
            super(id, nomUtilisateur, email);
        }
    }

    // -----------------------------------------
// PARTIE 3 : Classe Commentaire
// -----------------------------------------
    class Commentaire {
        private String contenu;
        private Utilisateur auteur;

        public Commentaire(String contenu, Utilisateur auteur) {
            this.contenu = contenu;
            this.auteur = auteur;
        }

        // Getters
    }

    // -----------------------------------------
// PARTIE 4 : Classe Publication
// -----------------------------------------
    class Publication {
        private String Content;
        private User Author;
        private List<Comments> commentaires = new ArrayList<>();

        public Publication(String contenu, Utilisateur auteur) {
            this.contenu = contenu;
            this.auteur = auteur;
        }

        public void AddComments(Comments Comments) {
            Comments.add(Comments);
        }

        public void DeleteComments(Comments Comments) {
            Comments.remove(Comments);
        }

        public boolean KeyWords(String KeyWords) {
            return Content.toLowerCase().contains(KeyWords.toLowerCase());
        }

        // Getters
    }

    // -----------------------------------------
// PARTIE 5 : Classe Groupe
// -----------------------------------------
    class Groupe {
        private String nom;
        private Administrateur administrateur;
        private List<Utilisateur> membres = new ArrayList<>();
        private List<Publication> publications = new ArrayList<>();

        public Groupe(String nom, Administrateur admin) {
            this.nom = nom;
            this.administrateur = admin;
            membres.add(admin); // admin est aussi membre
        }

        public void ajouterMembre(Utilisateur user) {
            membres.add(user);
        }

        public boolean contientUtilisateur(Utilisateur user) {
            return membres.stream().anyMatch(u ->
                    u.getClass() == user.getClass() &&
                            u.getId().equals(user.getId()) &&
                            u.getEmail().equals(user.getEmail())
            );
        }

        public void ajouterPublication(Publication pub) {
            publications.add(pub);
        }

        public void supprimerPublication(Publication pub) {
            publications.remove(pub);
        }

        public void supprimerUtilisateur(Utilisateur user) {
            membres.remove(user);
        }

        public List<Publication> rechercherParMotCle(String motCle) {
            return publications.stream()
                    .filter(pub -> pub.contientMotCle(motCle))
                    .collect(Collectors.toList());
        }

        public int compterPublications() {
            return publications.size();
        }
    }

}
