
import com.mycompany.englishbattle.Service.JoueurService;
import com.mycompany.englishbattle.ServiceImpl.JoueurServiceImpl;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author HB
 */
public class testFonction {

    public static void main(String[] args) {
        JoueurService jser = new JoueurServiceImpl();
        System.out.println("testFonction.main()");
        System.out.println(jser.afficherListeJoueur());
    }
}
