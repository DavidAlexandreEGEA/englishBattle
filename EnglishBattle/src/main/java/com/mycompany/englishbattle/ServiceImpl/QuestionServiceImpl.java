/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.englishbattle.ServiceImpl;

import com.mycompany.englishbattle.Service.QuestionService;
import com.mycompany.englishbattle.business.Verbe;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HB
 */
public class QuestionServiceImpl implements QuestionService {

    List<Verbe> listeVerbe = new ArrayList<>();

//    constructeur
    public QuestionServiceImpl() {
//creation des verbes
        Verbe acheter = new Verbe("buy", "bought", "bought");
        Verbe aller = new Verbe("go", "went", "gone");
        Verbe allerATouteVitesse = new Verbe("speed", "sped", "sped");
        Verbe allerFurtivement = new Verbe("slink", "slunk", "slunk");
        Verbe allumer = new Verbe("light", "lit", "lit");
        Verbe apporter = new Verbe("bring", "brought", "brought");
        Verbe apprendre = new Verbe("learn", "learnt", "learnt");
        Verbe attraper = new Verbe("catch", "caught", "caught");
        Verbe avoir = new Verbe("have", "had", "had");
        Verbe balayer = new Verbe("sweep", "swept", "swept");
        Verbe battre = new Verbe("beat", "beat", "beaten");
        Verbe blesser = new Verbe("hurt", "hurt", "hurt");
        Verbe boire = new Verbe("drink", "drank", "drunk");
        Verbe briller = new Verbe("shine", "shone", "shone");
        Verbe bruler = new Verbe("burn", "burnt", "burnt");
        Verbe seCacher = new Verbe("hide", "hid", "hidden");
        Verbe casser = new Verbe("break", "broke", "broken");
        Verbe cesserDe = new Verbe("quit", "quit", "quit");
        Verbe chanter = new Verbe("sing", "sang", "sung");
        Verbe chercher = new Verbe("seek", "sought", "sought");
        Verbe chevaucher = new Verbe("ride", "rode", "ridden");
        Verbe choisir = new Verbe("choose", "chose", "chosen");
        Verbe coller = new Verbe("stick", "stuck", "stuck");
        Verbe combattre = new Verbe("fight", "fought", "fought");
        Verbe commencer = new Verbe("begin", "began", "begun");
        Verbe comprendre = new Verbe("understand", "understood", "understood");
        Verbe conduire = new Verbe("drive", "drove", "driven");
        Verbe construire = new Verbe("build", "built", "built");
        Verbe coudre = new Verbe("sew", "sewed", "sewn");
        Verbe couler = new Verbe("sink", "sank", "sunk");
        Verbe couper = new Verbe("cut", "cut", "cut");
        Verbe seCourber = new Verbe("bend", "bent", "bent");
        Verbe courir = new Verbe("run", "ran", "run");
        Verbe couter = new Verbe("cost", "cost", "cost");
        Verbe cracher = new Verbe("spit", "spat", "spat");
        Verbe creuser = new Verbe("dig", "dig", "dig");
        Verbe seDebarrasser = new Verbe("rid", "rid", "rid");
        Verbe dechirer = new Verbe("tear", "tore", "torn");
        Verbe depenser = new Verbe("spend", "spent", "spent");
        Verbe dessiner = new Verbe("draw", "drew", "drawn");
        Verbe devenir = new Verbe("become", "became", "become");
        Verbe dire = new Verbe("say", "said", "said");
        Verbe raconter = new Verbe("tell", "told", "told");
        Verbe distribuer = new Verbe("deal", "dealt", "dealt");
        Verbe donner = new Verbe("give", "gave", "given");
        Verbe dormir = new Verbe("sleep", "slept", "slept");
        Verbe eclater = new Verbe("burst", "burst", "burst");
        Verbe ecrire = new Verbe("write", "wrote", "written");
        Verbe eleverDuBetail = new Verbe("breed", "bred", "bred");
        Verbe enfilerTendreUneCorde = new Verbe("string", "strung", "strung");
        Verbe enfler = new Verbe("swell", "swelled", "swollen");
        Verbe enfoncer = new Verbe("thrust", "thrust", "thrust");
        Verbe enrouler = new Verbe("wind", "wound", "wound");
        Verbe enseigner = new Verbe("teach", "taught", "taught");
        Verbe entendre = new Verbe("hear", "heard", "heard");
        Verbe envoyer = new Verbe("send", "sent", "sent");
        Verbe epeler = new Verbe("spell", "spelt", "spelt");
        Verbe etreAssis = new Verbe("sit", "sat", "sat");
        Verbe etreDebout = new Verbe("stand", "stood", "stood");
        Verbe etreDetendu = new Verbe("lie", "lay", "lain");
        Verbe faire = new Verbe("do", "did", "done");
        Verbe faireFabriquer = new Verbe("make", "made", "made");
        Verbe fendre = new Verbe("split", "split", "split");
        Verbe inciser = new Verbe("slit", "slit", "slit");
        Verbe fermer = new Verbe("shut", "shut", "shut");
        Verbe ferrerChausser = new Verbe("shoe", "shod", "shod");
        Verbe fixer = new Verbe("set", "set", "set");
        Verbe foulerAuxPieds = new Verbe("tread", "trod", "trodden");
        Verbe frapper = new Verbe("strike", "struck", "struck");
        Verbe frapperAtteindre = new Verbe("hit", "hit", "hit");
        Verbe gacherGater = new Verbe("spoil", "spoilt", "spoilt");
        Verbe gagner = new Verbe("win", "won", "won");
        Verbe garder = new Verbe("keep", "kept", "kept");
        Verbe geler = new Verbe("freeze", "froze", "frozen");
        Verbe glisser = new Verbe("slide", "slid", "slid");
        Verbe grandir = new Verbe("grow", "grew", "grown");
        Verbe habiter = new Verbe("dwell", "dwelt", "dwelt");
        Verbe interdire = new Verbe("forbid", "forbade", "forbidden");
        Verbe jaillirBondir = new Verbe("spring", "sprang", "sprung");
        Verbe jeter = new Verbe("cast", "cast", "cast");
        Verbe jeterVersExterieur = new Verbe("throw", "threw", "thrown");
        Verbe jeterViolemment = new Verbe("fling", "flung", "flung");
        Verbe jurer = new Verbe("swear", "swore", "sworn");
        Verbe laisserQuitter = new Verbe("leave", "left", "left");
        Verbe lancerAvecForce = new Verbe("sling", "slung", "slung");
        Verbe lierRelier = new Verbe("bind", "bound", "bound");
        Verbe lire = new Verbe("read", "read", "read");
        Verbe manger = new Verbe("eat", "ate", "eaten");
        Verbe marcherAGrandsPas = new Verbe("stride", "strode", "stridden");
        Verbe mener = new Verbe("lead", "led", "led");
        Verbe mettre = new Verbe("put", "put", "put");
        Verbe montrer = new Verbe("show", "showed", "shown");
        Verbe mordre = new Verbe("bite", "bit", "bitten");
        Verbe moudre = new Verbe("grind", "ground", "ground");
        Verbe nager = new Verbe("swim", "swam", "swum");
        Verbe nourrir = new Verbe("feed", "fed", "fed");
        Verbe obtenir = new Verbe("get", "got", "got");
        Verbe offrirUnPrix = new Verbe("bid", "bid", "bid");
        Verbe oublier = new Verbe("forget", "forgot", "forgotten");
        Verbe pardonner = new Verbe("forgive", "forgave", "forgiven");
        Verbe parier = new Verbe("bet", "bet", "bet");
        Verbe parler = new Verbe("speak", "spoke", "spoken");
        Verbe payer = new Verbe("pay", "paid", "paid");
        Verbe pendreAccrocher = new Verbe("hang", "hung", "hung");
        Verbe penser = new Verbe("think", "thought", "thought");
        Verbe perdre = new Verbe("lose", "lost", "lost");
        Verbe permettreLouer = new Verbe("let", "let", "let");
        Verbe piquer = new Verbe("sting", "stung", "stung");
        Verbe pleurer = new Verbe("weep", "wept", "wept");
        Verbe porterDesVetements = new Verbe("wear", "wore", "worn");
        Verbe poserAPlat = new Verbe("lay", "laid", "laid");
        Verbe prendre = new Verbe("take", "toke", "taken");
        Verbe preter = new Verbe("lend", "lent", "lent");
        Verbe puer = new Verbe("stink", "stank", "stunk");
        Verbe ramper = new Verbe("creep", "crept", "crept");
        Verbe seRencontrer = new Verbe("meet", "met", "met");
        Verbe renverserUnLiquide = new Verbe("spill", "spilt", "spilt");
        Verbe repandre = new Verbe("spread", "spread", "spread");
        Verbe retrecir = new Verbe("shrink", "shrank", "shrunk");
        Verbe seReveillerA = new Verbe("awake", "awoke", "awoken");
        Verbe seReveillerW = new Verbe("wake", "woke", "woken");
        Verbe rever = new Verbe("dream", "dreamt", "dreamt");
        Verbe sAccrocher = new Verbe("cling", "clung", "clung");
        Verbe sAgenouiller = new Verbe("kneel", "knelt", "knelt");
        Verbe saigner = new Verbe("bleed", "bled", "bled");
        Verbe sAppuyer = new Verbe("lean", "leant", "leant");
        Verbe sauter = new Verbe("leep", "lept", "lept");
        Verbe savoirConnaître = new Verbe("know", "knew", "known");
        Verbe scier = new Verbe("saw", "sawed", "sawn");
        Verbe seBalancer = new Verbe("swing", "swung", "swung");
        Verbe secouer = new Verbe("shake", "shoke", "shaken");
        Verbe sEfforcer = new Verbe("strive", "strove", "striven");
        Verbe sEleverSeLever = new Verbe("rise", "rose", "risen");
        Verbe semer = new Verbe("sow", "sowed", "sown");
        Verbe sEnfuir = new Verbe("flee", "fled", "fled");
        Verbe sentirOdorat = new Verbe("smell", "smelt", "smelt");
        Verbe sentirEprouver = new Verbe("feel", "felt", "felt");
        Verbe signifier = new Verbe("mean", "meant", "meant");
        Verbe sonner = new Verbe("ring", "rang", "rung");
        Verbe souffler = new Verbe("blow", "blew", "blown");
        Verbe supporter = new Verbe("bear", "bore", "borne");
        Verbe tenir = new Verbe("hold", "held", "held");
        Verbe tirerUneBalle = new Verbe("shoot", "shot", "shot");
        Verbe tisser = new Verbe("weave", "wove", "woven");
        Verbe tomber = new Verbe("fall", "fell", "fallen");
        Verbe tondreDesMoutons = new Verbe("shear", "sheared", "shorn");
        Verbe tordre = new Verbe("wring", "wrung", "wrung");
        Verbe trouver = new Verbe("find", "found", "found");
        Verbe vendre = new Verbe("sell", "sold", "sold");
        Verbe venir = new Verbe("come", "came", "come");
        Verbe verserDesLarmes = new Verbe("shed", "shed", "shed");
        Verbe voir = new Verbe("see", "saw", "seen");
        Verbe voler = new Verbe("fly", "flew", "flown");
        Verbe volerDerober = new Verbe("steal", "stole", "stolen");
//      chargement de la liste
        listeVerbe.add(acheter);
        listeVerbe.add(aller);
        listeVerbe.add(allerATouteVitesse);
        listeVerbe.add(allerFurtivement);
        listeVerbe.add(allumer);
        listeVerbe.add(apporter);
        listeVerbe.add(apprendre);
        listeVerbe.add(attraper);
        listeVerbe.add(avoir);
        listeVerbe.add(balayer);
        listeVerbe.add(battre);
        listeVerbe.add(blesser);
        listeVerbe.add(boire);
        listeVerbe.add(briller);
        listeVerbe.add(bruler);
        listeVerbe.add(seCacher);
        listeVerbe.add(casser);
        listeVerbe.add(cesserDe);
        listeVerbe.add(chanter);
        listeVerbe.add(chercher);
        listeVerbe.add(chevaucher);
        listeVerbe.add(choisir);
        listeVerbe.add(coller);
        listeVerbe.add(combattre);
        listeVerbe.add(commencer);
        listeVerbe.add(comprendre);
        listeVerbe.add(conduire);
        listeVerbe.add(construire);
        listeVerbe.add(coudre);
        listeVerbe.add(couler);
        listeVerbe.add(couper);
        listeVerbe.add(seCourber);
        listeVerbe.add(courir);
        listeVerbe.add(couter);
        listeVerbe.add(cracher);
        listeVerbe.add(creuser);
        listeVerbe.add(seDebarrasser);
        listeVerbe.add(dechirer);
        listeVerbe.add(depenser);
        listeVerbe.add(dessiner);
        listeVerbe.add(devenir);
        listeVerbe.add(dire);
        listeVerbe.add(raconter);
        listeVerbe.add(distribuer);
        listeVerbe.add(donner);
        listeVerbe.add(dormir);
        listeVerbe.add(eclater);
        listeVerbe.add(ecrire);
        listeVerbe.add(eleverDuBetail);
        listeVerbe.add(enfilerTendreUneCorde);
        listeVerbe.add(enfler);
        listeVerbe.add(enfoncer);
        listeVerbe.add(enrouler);
        listeVerbe.add(enseigner);
        listeVerbe.add(entendre);
        listeVerbe.add(envoyer);
        listeVerbe.add(epeler);
        listeVerbe.add(etreAssis);
        listeVerbe.add(etreDebout);
        listeVerbe.add(etreDetendu);
        listeVerbe.add(faire);
        listeVerbe.add(faireFabriquer);
        listeVerbe.add(fendre);
        listeVerbe.add(inciser);
        listeVerbe.add(fermer);
        listeVerbe.add(ferrerChausser);
        listeVerbe.add(fixer);
        listeVerbe.add(foulerAuxPieds);
        listeVerbe.add(frapper);
        listeVerbe.add(frapperAtteindre);
        listeVerbe.add(gacherGater);
        listeVerbe.add(gagner);
        listeVerbe.add(garder);
        listeVerbe.add(geler);
        listeVerbe.add(glisser);
        listeVerbe.add(grandir);
        listeVerbe.add(habiter);
        listeVerbe.add(interdire);
        listeVerbe.add(jaillirBondir);
        listeVerbe.add(jeter);
        listeVerbe.add(jeterVersExterieur);
        listeVerbe.add(jeterViolemment);
        listeVerbe.add(jurer);
        listeVerbe.add(laisserQuitter);
        listeVerbe.add(lancerAvecForce);
        listeVerbe.add(lierRelier);
        listeVerbe.add(lire);
        listeVerbe.add(manger);
        listeVerbe.add(marcherAGrandsPas);
        listeVerbe.add(mener);
        listeVerbe.add(mettre);
        listeVerbe.add(montrer);
        listeVerbe.add(mordre);
        listeVerbe.add(moudre);
        listeVerbe.add(nager);
        listeVerbe.add(nourrir);
        listeVerbe.add(obtenir);
        listeVerbe.add(offrirUnPrix);
        listeVerbe.add(oublier);
        listeVerbe.add(pardonner);
        listeVerbe.add(parier);
        listeVerbe.add(parler);
        listeVerbe.add(payer);
        listeVerbe.add(pendreAccrocher);
        listeVerbe.add(penser);
        listeVerbe.add(perdre);
        listeVerbe.add(permettreLouer);
        listeVerbe.add(piquer);
        listeVerbe.add(pleurer);
        listeVerbe.add(porterDesVetements);
        listeVerbe.add(poserAPlat);
        listeVerbe.add(prendre);
        listeVerbe.add(preter);
        listeVerbe.add(puer);
        listeVerbe.add(ramper);
        listeVerbe.add(seRencontrer);
        listeVerbe.add(renverserUnLiquide);
        listeVerbe.add(repandre);
        listeVerbe.add(retrecir);
        listeVerbe.add(seReveillerA);
        listeVerbe.add(seReveillerW);
        listeVerbe.add(rever);
        listeVerbe.add(sAccrocher);
        listeVerbe.add(sAgenouiller);
        listeVerbe.add(saigner);
        listeVerbe.add(sAppuyer);
        listeVerbe.add(sauter);
        listeVerbe.add(savoirConnaître);
        listeVerbe.add(scier);
        listeVerbe.add(seBalancer);
        listeVerbe.add(secouer);
        listeVerbe.add(sEfforcer);
        listeVerbe.add(sEleverSeLever);
        listeVerbe.add(semer);
        listeVerbe.add(sEnfuir);
        listeVerbe.add(sentirOdorat);
        listeVerbe.add(sentirEprouver);
        listeVerbe.add(signifier);
        listeVerbe.add(sonner);
        listeVerbe.add(souffler);
        listeVerbe.add(supporter);
        listeVerbe.add(tenir);
        listeVerbe.add(tirerUneBalle);
        listeVerbe.add(tisser);
        listeVerbe.add(tomber);
        listeVerbe.add(tondreDesMoutons);
        listeVerbe.add(tordre);
        listeVerbe.add(trouver);
        listeVerbe.add(vendre);
        listeVerbe.add(venir);
        listeVerbe.add(verserDesLarmes);
        listeVerbe.add(voir);
        listeVerbe.add(voler);
        listeVerbe.add(volerDerober);
    }

    @Override
    public Verbe afficherUnVerbe() {
        int numeroDansListe = (int) (Math.random()*(listeVerbe.size()-1));
        return listeVerbe.get(numeroDansListe);
    }

    @Override
    public boolean comparerReponse(String baseVerbale, String preterit, String participePasse) {
        for (Verbe verbe : listeVerbe) {
            if (verbe.getBaseVerbale().equals(baseVerbale) 
                    && verbe.getPreterit().equals(preterit) 
                    && verbe.getParticipePasse().equals(participePasse)) {
                return true;
            }
        }
        return false;
    }

}
