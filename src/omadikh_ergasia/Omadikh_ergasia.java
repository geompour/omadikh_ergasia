package omadikh_ergasia;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Omadikh_ergasia {

    /* Oρισμός του Entity Manager */
    public static EntityManager em;

    public static void main(String[] args) {

        /* Δημιουργία Entity Manager Factory */
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("eElectionsDBPU");

        /* Δημιουργία του Entity Manager */
        em = emf.createEntityManager();

        /* Δημιουργία αντικειμένων τύπου "Εκλογική Περιφέρεια" */
        TblElectoralPeriphery per1 = createNewElectoralPeriphery("Α΄ ΑΘΗΝΩΝ", 467108, 14);
        TblElectoralPeriphery per2 = createNewElectoralPeriphery("Β΄ ΑΘΗΝΩΝ", 1511739, 44);
        TblElectoralPeriphery per3 = createNewElectoralPeriphery("ΝΟΜΟΥ ΑΤΤΙΚΗΣ", 499627, 15);
        TblElectoralPeriphery per4 = createNewElectoralPeriphery("Α΄ ΠΕΙΡΑΙΩΣ", 192841, 6);
        TblElectoralPeriphery per5 = createNewElectoralPeriphery("Β΄ ΠΕΙΡΑΙΩΣ", 272682, 8);
        TblElectoralPeriphery per6 = createNewElectoralPeriphery("ΝΟΜΟΥ ΑΙΤΩΛΟΑΚΑΡΝΑΝΙΑΣ", 252004, 7);
        TblElectoralPeriphery per7 = createNewElectoralPeriphery("ΝΟΜΟΥ ΑΡΓΟΛΙΔΟΣ", 95561, 3);
        TblElectoralPeriphery per8 = createNewElectoralPeriphery("ΝΟΜΟΥ ΑΡΚΑΔΙΑΣ", 105448, 3);
        TblElectoralPeriphery per9 = createNewElectoralPeriphery("ΝΟΜΟΥ ΑΡΤΗΣ", 86417, 3);
        TblElectoralPeriphery per10 = createNewElectoralPeriphery("ΝΟΜΟΥ ΑΧΑΪΑΣ", 291461, 8);
        TblElectoralPeriphery per11 = createNewElectoralPeriphery("ΝΟΜΟΥ ΒΟΙΩΤΙΑΣ", 115765, 3);
        TblElectoralPeriphery per12 = createNewElectoralPeriphery("ΝΟΜΟΥ ΓΡΕΒΕΝΩΝ", 41294, 1);
        TblElectoralPeriphery per13 = createNewElectoralPeriphery("ΝΟΜΟΥ ΔΡΑΜΑΣ", 108578, 3);
        TblElectoralPeriphery per14 = createNewElectoralPeriphery("ΝΟΜΟΥ ΔΩΔΕΚΑΝΗΣΟΥ", 167152, 5);
        TblElectoralPeriphery per15 = createNewElectoralPeriphery("ΝΟΜΟΥ ΕΒΡΟΥ", 146376, 4);
        TblElectoralPeriphery per16 = createNewElectoralPeriphery("ΝΟΜΟΥ ΕΥΒΟΙΑΣ", 210957, 6);
        TblElectoralPeriphery per17 = createNewElectoralPeriphery("ΝΟΜΟΥ ΕΥΡΥΤΑΝΙΑΣ", 30790, 1);
        TblElectoralPeriphery per18 = createNewElectoralPeriphery("ΝΟΜΟΥ ΖΑΚΥΝΘΟΥ", 38641, 1);
        TblElectoralPeriphery per19 = createNewElectoralPeriphery("ΝΟΜΟΥ ΗΛΕΙΑΣ", 182456, 5);
        TblElectoralPeriphery per20 = createNewElectoralPeriphery("ΝΟΜΟΥ ΗΜΑΘΙΑΣ", 144494, 4);
        TblElectoralPeriphery per21 = createNewElectoralPeriphery("ΝΟΜΟΥ ΗΡΑΚΛΕΙΟΥ", 279833, 8);
        TblElectoralPeriphery per22 = createNewElectoralPeriphery("ΝΟΜΟΥ ΘΕΣΠΡΩΤΙΑΣ", 51156, 2);
        TblElectoralPeriphery per23 = createNewElectoralPeriphery("Α΄ ΘΕΣΣΑΛΟΝΙΚΗΣ", 565162, 16);
        TblElectoralPeriphery per24 = createNewElectoralPeriphery("Β΄ ΘΕΣΣΑΛΟΝΙΚΗΣ", 313032, 9);
        TblElectoralPeriphery per25 = createNewElectoralPeriphery("ΝΟΜΟΥ ΙΩΑΝΝΙΝΩΝ", 171315, 5);
        TblElectoralPeriphery per26 = createNewElectoralPeriphery("ΝΟΜΟΥ ΚΑΒΑΛΑΣ", 139213, 4);
        TblElectoralPeriphery per27 = createNewElectoralPeriphery("ΝΟΜΟΥ ΚΑΡΔΙΤΣΗΣ", 142201, 4);
        TblElectoralPeriphery per28 = createNewElectoralPeriphery("ΝΟΜΟΥ ΚΑΣΤΟΡΙΑΣ", 51481, 2);
        TblElectoralPeriphery per29 = createNewElectoralPeriphery("ΝΟΜΟΥ ΚΕΡΚΥΡΑΣ", 101113, 3);
        TblElectoralPeriphery per30 = createNewElectoralPeriphery("ΝΟΜΟΥ ΚΕΦΑΛΛΗΝΙΑΣ", 41365, 1);
        TblElectoralPeriphery per31 = createNewElectoralPeriphery("ΝΟΜΟΥ ΚΙΛΚΙΣ", 98906, 3);
        TblElectoralPeriphery per32 = createNewElectoralPeriphery("ΝΟΜΟΥ ΚΟΖΑΝΗΣ", 160321, 5);
        TblElectoralPeriphery per33 = createNewElectoralPeriphery("ΝΟΜΟΥ ΚΟΡΙΝΘΙΑΣ", 140710, 4);
        TblElectoralPeriphery per34 = createNewElectoralPeriphery("ΝΟΜΟΥ ΚΥΚΛΑΔΩΝ", 124109, 4);
        TblElectoralPeriphery per35 = createNewElectoralPeriphery("ΝΟΜΟΥ ΛΑΚΩΝΙΑΣ", 93462, 3);
        TblElectoralPeriphery per36 = createNewElectoralPeriphery("ΝΟΜΟΥ ΛΑΡΙΣΗΣ", 275921, 8);
        TblElectoralPeriphery per37 = createNewElectoralPeriphery("ΝΟΜΟΥ ΛΑΣΙΘΙΟΥ", 72198, 2);
        TblElectoralPeriphery per38 = createNewElectoralPeriphery("ΝΟΜΟΥ ΛΕΣΒΟΥ", 101786, 3);
        TblElectoralPeriphery per39 = createNewElectoralPeriphery("ΝΟΜΟΥ ΛΕΥΚΑΔΟΣ", 26796, 1);
        TblElectoralPeriphery per40 = createNewElectoralPeriphery("ΝΟΜΟΥ ΜΑΓΝΗΣΙΑΣ", 189658, 6);
        TblElectoralPeriphery per41 = createNewElectoralPeriphery("ΝΟΜΟΥ ΜΕΣΣΗΝΙΑΣ", 175587, 5);
        TblElectoralPeriphery per42 = createNewElectoralPeriphery("ΝΟΜΟΥ ΞΑΝΘΗΣ", 110885, 3);
        TblElectoralPeriphery per43 = createNewElectoralPeriphery("ΝΟΜΟΥ ΠΕΛΛΗΣ", 151747, 4);
        TblElectoralPeriphery per44 = createNewElectoralPeriphery("ΝΟΜΟΥ ΠΙΕΡΙΑΣ", 129999, 4);
        TblElectoralPeriphery per45 = createNewElectoralPeriphery("ΝΟΜΟΥ ΠΡΕΒΕΖΗΣ", 65867, 2);
        TblElectoralPeriphery per46 = createNewElectoralPeriphery("ΝΟΜΟΥ ΡΕΘΥΜΝΗΣ", 79778, 2);
        TblElectoralPeriphery per47 = createNewElectoralPeriphery("ΝΟΜΟΥ ΡΟΔΟΠΗΣ", 108555, 3);
        TblElectoralPeriphery per48 = createNewElectoralPeriphery("ΝΟΜΟΥ ΣΑΜΟΥ", 42380, 1);
        TblElectoralPeriphery per49 = createNewElectoralPeriphery("ΝΟΜΟΥ ΣΕΡΡΩΝ", 214376, 6);
        TblElectoralPeriphery per50 = createNewElectoralPeriphery("ΝΟΜΟΥ ΤΡΙΚΑΛΩΝ", 150938, 4);
        TblElectoralPeriphery per51 = createNewElectoralPeriphery("ΝΟΜΟΥ ΦΘΙΩΤΙΔΟΣ", 165062, 5);
        TblElectoralPeriphery per52 = createNewElectoralPeriphery("ΝΟΜΟΥ ΦΛΩΡΙΝΗΣ", 56374, 2);
        TblElectoralPeriphery per53 = createNewElectoralPeriphery("ΝΟΜΟΥ ΦΩΚΙΔΟΣ", 44959, 1);
        TblElectoralPeriphery per54 = createNewElectoralPeriphery("ΝΟΜΟΥ ΧΑΛΚΙΔΙΚΗΣ", 108714, 3);
        TblElectoralPeriphery per55 = createNewElectoralPeriphery("ΝΟΜΟΥ ΧΑΝΙΩΝ", 142470, 4);
        TblElectoralPeriphery per56 = createNewElectoralPeriphery("ΝΟΜΟΥ ΧΙΟΥ", 53004, 2);
    }

    /* Δημιουργία νέας "Εκλογικής Περιφέρειας" */
    static TblElectoralPeriphery createNewElectoralPeriphery(String periphery_name, Integer registeredCitizens_count, Integer seats_count) {
        em.getTransaction().begin();
        TblElectoralPeriphery ep = new TblElectoralPeriphery(periphery_name, registeredCitizens_count, seats_count); //έχει δημιουργηθεί κατάλληλος constractor
        em.persist(ep); //entity managed
        em.getTransaction().commit();
        System.out.println("Δημιουργήθηκε η Εκλογική Περιφέρεια '" + periphery_name + "' με " + String.format("%,d", registeredCitizens_count) + " εγγεγραμμένους πολίτες και " + seats_count + " έδρ" + (seats_count == 1 ? "α" : "ες"));
        return ep;
    }
}
