package de.jakobkarolus.dotabuttons.io;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.Vector;

import de.jakobkarolus.dotabuttons.R;
import de.jakobkarolus.dotabuttons.model.HeroResponse;
import de.jakobkarolus.dotabuttons.model.Heroes;

import static de.jakobkarolus.dotabuttons.model.Heroes.ABADDON;
import static de.jakobkarolus.dotabuttons.model.Heroes.ALCHEMIST;
import static de.jakobkarolus.dotabuttons.model.Heroes.ANCIENT_APPARITION;
import static de.jakobkarolus.dotabuttons.model.Heroes.ANTIMAGE;
import static de.jakobkarolus.dotabuttons.model.Heroes.AXE;
import static de.jakobkarolus.dotabuttons.model.Heroes.BANE;
import static de.jakobkarolus.dotabuttons.model.Heroes.BATRIDER;
import static de.jakobkarolus.dotabuttons.model.Heroes.BOUNTY_HUNTER;
import static de.jakobkarolus.dotabuttons.model.Heroes.BREWMASTER;
import static de.jakobkarolus.dotabuttons.model.Heroes.BRISTLEBACK;
import static de.jakobkarolus.dotabuttons.model.Heroes.CLOCKWERK;
import static de.jakobkarolus.dotabuttons.model.Heroes.CREEP;
import static de.jakobkarolus.dotabuttons.model.Heroes.CRYSTAL_MAIDEN;
import static de.jakobkarolus.dotabuttons.model.Heroes.DARK_SEER;
import static de.jakobkarolus.dotabuttons.model.Heroes.DAZZLE;
import static de.jakobkarolus.dotabuttons.model.Heroes.EARTHSHAKER;
import static de.jakobkarolus.dotabuttons.model.Heroes.ENIGMA;
import static de.jakobkarolus.dotabuttons.model.Heroes.FACELESS_VOID;
import static de.jakobkarolus.dotabuttons.model.Heroes.GLADOS;
import static de.jakobkarolus.dotabuttons.model.Heroes.GYROCOPTER;
import static de.jakobkarolus.dotabuttons.model.Heroes.INVOKER;
import static de.jakobkarolus.dotabuttons.model.Heroes.JUGGERNAUT;
import static de.jakobkarolus.dotabuttons.model.Heroes.KEEPER_OF_THE_LIGHT;
import static de.jakobkarolus.dotabuttons.model.Heroes.KUNKKA;
import static de.jakobkarolus.dotabuttons.model.Heroes.LEGION_COMMANDER;
import static de.jakobkarolus.dotabuttons.model.Heroes.LINA;
import static de.jakobkarolus.dotabuttons.model.Heroes.LUNA;
import static de.jakobkarolus.dotabuttons.model.Heroes.MAGNUS;
import static de.jakobkarolus.dotabuttons.model.Heroes.MEEPO;
import static de.jakobkarolus.dotabuttons.model.Heroes.MIRANA;
import static de.jakobkarolus.dotabuttons.model.Heroes.NATURES_PROPHET;
import static de.jakobkarolus.dotabuttons.model.Heroes.NECROPHOS;
import static de.jakobkarolus.dotabuttons.model.Heroes.NIGHT_STALKER;
import static de.jakobkarolus.dotabuttons.model.Heroes.NYX_ASSASSIN;
import static de.jakobkarolus.dotabuttons.model.Heroes.OGRE_MAGI;
import static de.jakobkarolus.dotabuttons.model.Heroes.PUCK;
import static de.jakobkarolus.dotabuttons.model.Heroes.PUDGE;
import static de.jakobkarolus.dotabuttons.model.Heroes.PUGNA;
import static de.jakobkarolus.dotabuttons.model.Heroes.QUEEN_OF_PAIN;
import static de.jakobkarolus.dotabuttons.model.Heroes.REPORTER;
import static de.jakobkarolus.dotabuttons.model.Heroes.RUBICK;
import static de.jakobkarolus.dotabuttons.model.Heroes.SHADOW_FIEND;
import static de.jakobkarolus.dotabuttons.model.Heroes.SHADOW_SHAMAN;
import static de.jakobkarolus.dotabuttons.model.Heroes.SHOPKEEPER;
import static de.jakobkarolus.dotabuttons.model.Heroes.SKYWRATH_MAGE;
import static de.jakobkarolus.dotabuttons.model.Heroes.SLARDAR;
import static de.jakobkarolus.dotabuttons.model.Heroes.SLARK;
import static de.jakobkarolus.dotabuttons.model.Heroes.SNIPER;
import static de.jakobkarolus.dotabuttons.model.Heroes.STORM_SPIRIT;
import static de.jakobkarolus.dotabuttons.model.Heroes.SVEN;
import static de.jakobkarolus.dotabuttons.model.Heroes.TECHIES;
import static de.jakobkarolus.dotabuttons.model.Heroes.TEMPLAR_ASSASSIN;
import static de.jakobkarolus.dotabuttons.model.Heroes.TERRORBLADE;
import static de.jakobkarolus.dotabuttons.model.Heroes.TIDEHUNTER;
import static de.jakobkarolus.dotabuttons.model.Heroes.TIMBERSAW;
import static de.jakobkarolus.dotabuttons.model.Heroes.TINKER;
import static de.jakobkarolus.dotabuttons.model.Heroes.TUSK;
import static de.jakobkarolus.dotabuttons.model.Heroes.URSA;
import static de.jakobkarolus.dotabuttons.model.Heroes.WINDRANGER;
import static de.jakobkarolus.dotabuttons.model.Heroes.WITCH_DOCTOR;
import static de.jakobkarolus.dotabuttons.model.Heroes.WRAITH_KING;
import static de.jakobkarolus.dotabuttons.model.Heroes.ZEUS;

/**
 * loads the available hero respoonses
 * 
 * @author Jakob
 *
 */
public class HeroResponseParser {
	

	/**
	 * loads hero responses of Dota 2 Reporter(hard-coded)<br>
     * Map is per hero, list per response
	 * 
	 * @return {@link java.util.Map} of {@link List} of {@link HeroResponse} sorted alphabetically
	 */
	public static Map<Heroes, List<HeroResponse>> loadReporterResponseData(){

        List<HeroResponse> entries = new Vector<>();

        entries.add(new HeroResponse("I don't like magic", ANTIMAGE, R.raw.anti_mage_dont_like_magic));
        entries.add(new HeroResponse("Is this your card", ANTIMAGE, R.raw.anti_mage_is_this_your_card));
        entries.add(new HeroResponse("Cleanup time!", ANTIMAGE, R.raw.anti_mage_cleanup_time));
        entries.add(new HeroResponse("Steroid creeps", ANTIMAGE, R.raw.anti_mage_steroid_creeps));
        entries.add(new HeroResponse("I have finished farming.", ANTIMAGE, R.raw.anti_mage_finished_farming));
        entries.add(new HeroResponse("This is a team game?", REPORTER, R.raw.reporter_this_is_a_team_game));
        entries.add(new HeroResponse("Magic paper", REPORTER, R.raw.reporter_magic_paper));
        entries.add(new HeroResponse("F* your shit, I'm a siege creep.", REPORTER, R.raw.reporter_siege_creep));
        entries.add(new HeroResponse("Demon edge, sacred relic", REPORTER, R.raw.reporter_divine_rapier));
        entries.add(new HeroResponse("Regret my decision", REPORTER, R.raw.reporter_decision_regret));
        entries.add(new HeroResponse("Terrorblade farming", REPORTER, R.raw.reporter_terror_farming));
        entries.add(new HeroResponse("Hello, I'm Ymir the tusk.", TUSK, R.raw.tusk_hello));

		entries.add(new HeroResponse("Shoot him!", ENIGMA, R.raw.engima_enemy_closing_in));
		entries.add(new HeroResponse("Activate! Blink! Go!", ENIGMA, R.raw.engima_blink));
		entries.add(new HeroResponse("Nyctasha", BANE, R.raw.bane_nyctasha));
		entries.add(new HeroResponse("Engima in the jungle", ENIGMA, R.raw.enigma_in_the_jungle));
		entries.add(new HeroResponse("Grand Magus.", RUBICK, R.raw.rubick_grand_magus));
		entries.add(new HeroResponse("Got 'em", RUBICK, R.raw.rubick_got_em));
		entries.add(new HeroResponse("What are you hookin' me for?", PUDGE, R.raw.pudge_creep_hook));
		entries.add(new HeroResponse("Missing middle!", PUDGE, R.raw.pudge_lane_missing_02));
		entries.add(new HeroResponse("Keep doin' what you're doin'", ENIGMA, R.raw.enigma_rubick_keep_doing));
		entries.add(new HeroResponse("Rubick, you're a crazy f*, aren't you", ENIGMA, R.raw.engima_rubick_crazy));
		entries.add(new HeroResponse("Really good hooker", RUBICK, R.raw.rubick_good_hooker));
		entries.add(new HeroResponse("Haha you're stunned!", ENIGMA, R.raw.enigma_haha_stunned));
		entries.add(new HeroResponse("The art of echo-location", FACELESS_VOID, R.raw.void_echo_location));
		entries.add(new HeroResponse("Accept this and move on", RUBICK, R.raw.rubick_accept_and_move_on));
		entries.add(new HeroResponse("Gank some fools", ENIGMA, R.raw.engima_gank_some_fools));
		entries.add(new HeroResponse("Gee, I love living!", CREEP, R.raw.creep_love_living));
		entries.add(new HeroResponse("Bristles on me back", BRISTLEBACK, R.raw.bristleback_bristles_on_back));
		entries.add(new HeroResponse("Cotton candy", INVOKER, R.raw.invoker_cotton_candy));
		entries.add(new HeroResponse("I don't even know how I got here", GYROCOPTER, R.raw.gyrocopter_how_i_got_here));
		entries.add(new HeroResponse("I was here third!", GYROCOPTER, R.raw.gyrocopter_third));
		entries.add(new HeroResponse("Food to the opposing team", INVOKER, R.raw.invoker_food));
		entries.add(new HeroResponse("No sense at all", BRISTLEBACK, R.raw.bristleback_no_sense_at_all));
		entries.add(new HeroResponse("Gimmie gimmie gimmie", GYROCOPTER, R.raw.gyrocopter_mine));
		entries.add(new HeroResponse("I'll report you", RUBICK, R.raw.rubick_report));
		entries.add(new HeroResponse("Mustache", GYROCOPTER, R.raw.gyrocopter_mustache));
		entries.add(new HeroResponse("Enigma in the jungle 2", ENIGMA, R.raw.engima_jungle_2));
		entries.add(new HeroResponse("New meta", NATURES_PROPHET, R.raw.prophet_new_meta));
		entries.add(new HeroResponse("Game is hard", NATURES_PROPHET, R.raw.prophet_game_is_hard));
		entries.add(new HeroResponse("Pew pew pew", GYROCOPTER, R.raw.gyrocopter_pew_pew_pew));
		entries.add(new HeroResponse("GG branch", INVOKER, R.raw.invoker_gg_branch));
		entries.add(new HeroResponse("Wex exort exort", INVOKER, R.raw.invoker_wex_exort_exort));
		entries.add(new HeroResponse("Keep your eyes peeled", RUBICK, R.raw.rubick_eyes_peeled));
		entries.add(new HeroResponse("Oh my gawd", ENIGMA, R.raw.enigma_omg));
		entries.add(new HeroResponse("Exort exort exort", INVOKER, R.raw.invoker_exort_exort_exort));
		entries.add(new HeroResponse("Biological warfare", INVOKER, R.raw.invoker_biological_warfare));
		entries.add(new HeroResponse("Euls scepter of divinity", INVOKER, R.raw.invoker_euls));
		entries.add(new HeroResponse("I f* love drumming", GYROCOPTER, R.raw.gyrocopter_love_drumming));
		entries.add(new HeroResponse("I'm a mass murderer", GYROCOPTER, R.raw.gyrocopter_mass_murderer));
		entries.add(new HeroResponse("Immortalitah", GYROCOPTER, R.raw.gyrocopter_immortalitah));
		entries.add(new HeroResponse("I've got the aegis, bitches", GYROCOPTER, R.raw.gyrocopter_aegis));
		entries.add(new HeroResponse("Panic drums panic", GYROCOPTER, R.raw.gyrocopter_panic_drums_panic));
		entries.add(new HeroResponse("I don't understand you", GYROCOPTER, R.raw.gyrocopter_language_understand));
		entries.add(new HeroResponse("Oink oink oink", ENIGMA, R.raw.enigma_oink));
		entries.add(new HeroResponse("Nobody temporarily ends my life", GYROCOPTER, R.raw.gyrocopter_temporarily_end_life));
		entries.add(new HeroResponse("Shiny red bullets", GYROCOPTER, R.raw.gyrocopter_red_bullets));
		entries.add(new HeroResponse("Operation SNPUHHPRZ", GYROCOPTER, R.raw.gyrocopter_operation_snpuhhprz));
		entries.add(new HeroResponse("Surprise shitpickle", GYROCOPTER, R.raw.gyrocopter_suprise_shitpickle));
		entries.add(new HeroResponse("More easily overestimate my tankiness", BRISTLEBACK, R.raw.bristleback_overestimate_tankiness));
		entries.add(new HeroResponse("Universe not the same without me", INVOKER, R.raw.invoker_universe_not_the_same));
		entries.add(new HeroResponse("Relocated to a new location", INVOKER, R.raw.invoker_relocate));
		entries.add(new HeroResponse("GG please end quickly", INVOKER, R.raw.invoker_gg_end_quickly));
		entries.add(new HeroResponse("Dota in a nutshell", ENIGMA, R.raw.enigma_dota_nutshell));
		entries.add(new HeroResponse("Arcane boots", RUBICK, R.raw.rubick_arcane_boots));
		entries.add(new HeroResponse("Deafening blast", ENIGMA, R.raw.enigma_def_blast));
		entries.add(new HeroResponse("Manta style", GYROCOPTER, R.raw.gyrocopter_manta_style));
		entries.add(new HeroResponse("Rocket ships", ENIGMA, R.raw.enigma_rocket_ships));
		entries.add(new HeroResponse("Meep mop defense system", RUBICK, R.raw.rubick_meep_mop));
		entries.add(new HeroResponse("Meeega creeps", ENIGMA, R.raw.enigma_mega_creeps));
		entries.add(new HeroResponse("Throw", GYROCOPTER, R.raw.gyrocopter_throw));
		entries.add(new HeroResponse("The reason I lost", INVOKER, R.raw.invoker_reason_lost));
		entries.add(new HeroResponse("Let's abandon", RUBICK, R.raw.rubick_abandon));
		entries.add(new HeroResponse("Pirate hat", TIDEHUNTER, R.raw.tidehunter_pirate_hat));
		entries.add(new HeroResponse("Octohead, sharkyback and squintbuddy", TIDEHUNTER, R.raw.tidehunter_octohead_sharkybag_squintbuddy));
		entries.add(new HeroResponse("Whitty remark about first blood", JUGGERNAUT, R.raw.juggernaut_first_blood));
		entries.add(new HeroResponse("Look, a tree", TIMBERSAW, R.raw.timbersaw_tree));
		entries.add(new HeroResponse("Eject", TIMBERSAW, R.raw.timbersaw_eject));
		entries.add(new HeroResponse("Axe is axe", AXE, R.raw.axe_interview));
		entries.add(new HeroResponse("Free farmin'", JUGGERNAUT, R.raw.juggernaut_free_farming));
		entries.add(new HeroResponse("Axehole", TERRORBLADE, R.raw.terrorblade_axehole));
		entries.add(new HeroResponse("He was gone just like that", ENIGMA, R.raw.enigma_he_was_gone));
		entries.add(new HeroResponse("Friends help kill Kunkka", TIDEHUNTER, R.raw.tidehunter_kunkka_kill));
		entries.add(new HeroResponse("Tidehunter okay", TIDEHUNTER, R.raw.tidehunter_okay));
		entries.add(new HeroResponse("Who's the carry", TERRORBLADE, R.raw.terrorblade_i_am_the_carry));
		entries.add(new HeroResponse("Badass flaming footsteps", TERRORBLADE, R.raw.terrorblade_badass_footsteps));
		entries.add(new HeroResponse("I can do it, too", TERRORBLADE, R.raw.terrorblade_illusion));
		entries.add(new HeroResponse("What are you gonna do about it?", SHOPKEEPER, R.raw.shopkeeper_bitch));
		entries.add(new HeroResponse("Naah", PUDGE, R.raw.pudge_naah));
		entries.add(new HeroResponse("What a rip-off", TERRORBLADE, R.raw.terrorblade_what_a_ripoff));
		entries.add(new HeroResponse("I'll get over it", TERRORBLADE, R.raw.terrorblade_ill_get_over_it));
		entries.add(new HeroResponse("Terrorblade in the jungle", TERRORBLADE, R.raw.terrorblade_in_the_jungle));
		entries.add(new HeroResponse("What's makin' all that ruckus", TERRORBLADE, R.raw.terrorblade_making_all_that_ruckus));
		
		//Version 1.1
		boolean newVersion = false;
		entries.add(new HeroResponse("Gooooold!", KUNKKA, R.raw.kunkka_gold, false));
		entries.add(new HeroResponse("Dota 1 thing", KUNKKA, R.raw.kunkka_dota1_thing, false));
		entries.add(new HeroResponse("Buuuurn", ENIGMA, R.raw.enigma_burn, false));
		entries.add(new HeroResponse("Retreat with an advantage", ENIGMA, R.raw.enigma_advantage, false));
		entries.add(new HeroResponse("Poor piggy", TIDEHUNTER, R.raw.tide_poor_piggy, false));
		entries.add(new HeroResponse("Blink dagger, where are you?", TIDEHUNTER, R.raw.tide_blink_dagger, false));
		entries.add(new HeroResponse("Allergic to total ownage", TERRORBLADE, R.raw.terrorblade_total_ownage, false));
		entries.add(new HeroResponse("Totally worth it", TERRORBLADE, R.raw.terrorblade_worth_it, false));
		entries.add(new HeroResponse("My own eidolons", RUBICK, R.raw.rubick_own_eidolons, false));
		entries.add(new HeroResponse("Oh gawd, oh man", ENIGMA, R.raw.enigma_oh_gawd_oh_man, false));
		entries.add(new HeroResponse("Super creeps", CREEP, R.raw.creep_super_creep, false));
		entries.add(new HeroResponse("Puny and regular", CREEP, R.raw.creep_puny_and_regular, false));
		entries.add(new HeroResponse("Wow amazing", ENIGMA, R.raw.enigma_amazing, false));
		entries.add(new HeroResponse("That was lame", JUGGERNAUT, R.raw.jugg_lame, false));
		entries.add(new HeroResponse("Chu Chu!", TIMBERSAW, R.raw.timbersaw_chu_chu, false));
		entries.add(new HeroResponse("Smoke train", TIMBERSAW, R.raw.timbersaw_smoke_train2, false));
		entries.add(new HeroResponse("Chu chu honk!", TIMBERSAW, R.raw.timbersaw_smoke_train, false));
		entries.add(new HeroResponse("Flying fuck", ENIGMA, R.raw.enigma_flying_fuck, false));
		entries.add(new HeroResponse("Just act normal", TIDEHUNTER, R.raw.tide_act_normal, false));
		entries.add(new HeroResponse("Here to save the ...", JUGGERNAUT, R.raw.jugg_safe_the_day, false));
		entries.add(new HeroResponse("Enigma kick", ENIGMA, R.raw.enigma_kick, false));
		entries.add(new HeroResponse("You and me Rubick", ENIGMA, R.raw.enigma_you_and_me, false));
		entries.add(new HeroResponse("Fuck wards", ENIGMA, R.raw.enigma_fuck_wards, false));
		entries.add(new HeroResponse("Gameplay depth", ENIGMA, R.raw.enigma_gameplay_depth, false));
		entries.add(new HeroResponse("Sorry", TIDEHUNTER, R.raw.tidehunter_sorry, false));
		entries.add(new HeroResponse("Bloodstone", TIMBERSAW, R.raw.timbersaw_bloodstone, false));
        entries.add(new HeroResponse("Delaying the inevitable", ENIGMA, R.raw.enigma_delaying_inevitable, false));

        //Version 1.3
        newVersion = true;
        entries.add(new HeroResponse("Noooo", TIDEHUNTER, R.raw.tide_noo, true));
        entries.add(new HeroResponse("Mask on my mask", JUGGERNAUT, R.raw.jugg_mask_on_mask, true));
        entries.add(new HeroResponse("Smack em", ENIGMA, R.raw.enigma_smack_em, true));
        entries.add(new HeroResponse("Commended for Leadership", TIMBERSAW, R.raw.timber_commended, true));
        entries.add(new HeroResponse("Your life is now validated", TIMBERSAW, R.raw.timber_life_validated, true));
        entries.add(new HeroResponse("Commended for being forgiving", KUNKKA, R.raw.kunkka_forgiving, true));
        entries.add(new HeroResponse("I liked the part where you pressed R", JUGGERNAUT, R.raw.jugger_part_pressed_r, true));
        entries.add(new HeroResponse("Seeking commendations", KUNKKA, R.raw.kunkka_commendations, true));

		return toMap(entries);
		
	}

    private static Map<Heroes, List<HeroResponse>> toMap(List<HeroResponse> entries) {

        Map<Heroes, List<HeroResponse>> map = new TreeMap<Heroes, List<HeroResponse>>(new Comparator<Heroes>() {

            @Override
            public int compare(Heroes left, Heroes right) {
                return left.compareTo(right);
            }
        });

        sort(entries);

        Heroes currentHero = entries.get(0).getHero();
        List<HeroResponse> currentList = new Vector<>();

        for(HeroResponse r : entries){
            if(r.getHero() == currentHero)
                currentList.add(r);
            else{
                map.put(currentHero, new Vector<HeroResponse>(currentList));
                currentHero = r.getHero();
                currentList.clear();
                currentList.add(r);
            }
        }
        return map;
    }

    private static List<HeroResponse> sort(List<HeroResponse> entries){
        Collections.sort(entries, new Comparator<HeroResponse>() {
            @Override
            public int compare(HeroResponse lhs, HeroResponse rhs) {
                Heroes left = lhs.getHero();
                Heroes right = rhs.getHero();

                if(left.compareTo(right) == 0)
                    return lhs.getResponse().compareTo(rhs.getResponse());

                return left.compareTo(right);
            }
        });
        return entries;
    }

    /**
	 * loads hero responses of Dota 2 (hard-coded)
     * map is per hero, list per response
	 * 
	 * @return {@ling Map} of {@link List} of {@link HeroResponse} sorted alphabetically
	 */
	public static Map<Heroes, List<HeroResponse>>  loadDotaHeroResponseData() {
		
		List<HeroResponse> entries = new Vector<HeroResponse>(); 

		entries.add(new HeroResponse("You can keep your magic", TINKER, R.raw.tink_ability_laser_01));
		entries.add(new HeroResponse("Magic is an abomination", ANTIMAGE, R.raw.anti_magicuser_01));
		entries.add(new HeroResponse("Lord of Avernus", ABADDON, R.raw.abad_spawn_02));
		entries.add(new HeroResponse("First blood", ABADDON, R.raw.abad_firstblood_01));
		entries.add(new HeroResponse("Very cunning", ABADDON, R.raw.abad_move_19));
		entries.add(new HeroResponse("Run them down", ABADDON, R.raw.abad_attack_11));
		entries.add(new HeroResponse("You have cast death upon yourself", ABADDON, R.raw.abad_cast_02));
		entries.add(new HeroResponse("A shield of power", ABADDON, R.raw.abad_aphoticshield_02));
		entries.add(new HeroResponse("Laughter", ABADDON, R.raw.abad_kill_16));
		entries.add(new HeroResponse("Bow to your lord", ABADDON, R.raw.abad_lasthit_06));
		entries.add(new HeroResponse("Brains and brawns", ALCHEMIST, R.raw.alch_spawn_05));
		entries.add(new HeroResponse("Didnt throw", ALCHEMIST, R.raw.alch_ability_concoc_25));
		entries.add(new HeroResponse("What the ...", ALCHEMIST, R.raw.alch_ability_concoc_13));
		entries.add(new HeroResponse("Throw the damn thing", ALCHEMIST, R.raw.alch_ability_concoc_20));
		entries.add(new HeroResponse("Talk about overreacting", ALCHEMIST, R.raw.alch_kill_08));
		entries.add(new HeroResponse("Tell the ogre you're sorry", ALCHEMIST, R.raw.alch_kill_10));
		entries.add(new HeroResponse("Okey dokey", ALCHEMIST, R.raw.alch_move_05));
		entries.add(new HeroResponse("Go go go", ALCHEMIST, R.raw.alch_move_22));
		entries.add(new HeroResponse("Sorry friend, I let you down", ALCHEMIST, R.raw.alch_death_09));
		entries.add(new HeroResponse("Who's my little buddy", ALCHEMIST, R.raw.alch_rare_01));
		entries.add(new HeroResponse("Say hello to the nice people", ALCHEMIST, R.raw.alch_rare_04));
		entries.add(new HeroResponse("Denied", ALCHEMIST, R.raw.alch_deny_16));
		entries.add(new HeroResponse("Laughter", ANCIENT_APPARITION, R.raw.appa_kill_17));
		entries.add(new HeroResponse("Magic ends here", ANTIMAGE, R.raw.anti_spawn_04));
		entries.add(new HeroResponse("Tis in thy head", ANTIMAGE, R.raw.anti_attack_09));
		entries.add(new HeroResponse("Consider thyself purified", ANTIMAGE, R.raw.anti_kill_02));
		entries.add(new HeroResponse("What magic is this", ANTIMAGE, R.raw.anti_death_02));
		entries.add(new HeroResponse("Laughter", ANTIMAGE, R.raw.anti_laugh_05));
		entries.add(new HeroResponse("Oath to defeat all sorceries", ANTIMAGE, R.raw.anti_respawn_05));
		entries.add(new HeroResponse("Destroy every magical alliance", ANTIMAGE, R.raw.anti_rare_04));
		entries.add(new HeroResponse("Nay", ANTIMAGE, R.raw.anti_deny_06));
		entries.add(new HeroResponse("Are you even trying", ANTIMAGE, R.raw.anti_deny_12));
		entries.add(new HeroResponse("Victory", ANTIMAGE, R.raw.anti_win_02));
		entries.add(new HeroResponse("To the enemy", AXE, R.raw.axe_move_08));
		entries.add(new HeroResponse("Let the carnage begin", AXE, R.raw.axe_spawn_08));
		entries.add(new HeroResponse("Axe brings the axe", AXE, R.raw.axe_attack_05));
		entries.add(new HeroResponse("I said good day sir", AXE, R.raw.axe_deny_16));
		entries.add(new HeroResponse("Axe happened", AXE, R.raw.axe_rival_22));
		entries.add(new HeroResponse("Axe-actly", AXE, R.raw.axe_rival_23));
		entries.add(new HeroResponse("Fought badly, died worse", AXE, R.raw.axe_kill_06));
		entries.add(new HeroResponse("Axe-amination", AXE, R.raw.axe_ally_12));
		entries.add(new HeroResponse("Time for an re-en-axe-ment", AXE, R.raw.axe_fastres_01));
		entries.add(new HeroResponse("Bottling rune", AXE, R.raw.axe_bottle_04));
		entries.add(new HeroResponse("Laughter", BANE, R.raw.bane_battlebegins_01));
		entries.add(new HeroResponse("Eh-haw", BATRIDER, R.raw.bat_battlebegins_01));
		entries.add(new HeroResponse("Yeah girl", BATRIDER, R.raw.bat_move_08));
		entries.add(new HeroResponse("What a ride", BATRIDER, R.raw.bat_move_15));
		entries.add(new HeroResponse("Yeah yeah yeah", BATRIDER, R.raw.bat_cast_04));
		entries.add(new HeroResponse("Love that smell", BATRIDER, R.raw.bat_ability_firefly_04));
		entries.add(new HeroResponse("Woah, sick burn", BATRIDER, R.raw.bat_kill_04));
		entries.add(new HeroResponse("Backwarmer", BATRIDER, R.raw.bat_rival_01));
		entries.add(new HeroResponse("Bat to the future", BATRIDER, R.raw.bat_rival_21));
		entries.add(new HeroResponse("Denied", BATRIDER, R.raw.bat_deny_01));
		entries.add(new HeroResponse("Just got personal", BOUNTY_HUNTER, R.raw.bount_respawn_12));
		entries.add(new HeroResponse("Laughter", BOUNTY_HUNTER, R.raw.bount_laugh_02));
		entries.add(new HeroResponse("Just a bit tipsy", BREWMASTER, R.raw.brew_move_08));
		entries.add(new HeroResponse("Celebrate with another round", BREWMASTER, R.raw.brew_level_06));
		entries.add(new HeroResponse("Laughter", BREWMASTER, R.raw.brew_laugh_03));
		entries.add(new HeroResponse("Facing need mashing", BRISTLEBACK, R.raw.bristle_move_09));
		entries.add(new HeroResponse("Want some of this?", BRISTLEBACK, R.raw.bristle_attack_18));
		entries.add(new HeroResponse("Some goo for you", BRISTLEBACK, R.raw.bristle_nasal_goo_06));
		entries.add(new HeroResponse("Suck it", BRISTLEBACK, R.raw.bristle_laugh_05));
		entries.add(new HeroResponse("Oopsy daisy", BRISTLEBACK, R.raw.bristle_lasthit_11));
		entries.add(new HeroResponse("Degree in mechanical domineering", CLOCKWERK, R.raw.ratt_respawn_10));
		entries.add(new HeroResponse("I am a robot", CLOCKWERK, R.raw.ratt_respawn_18));
		entries.add(new HeroResponse("Fun and games", CRYSTAL_MAIDEN, R.raw.cm_battlebegins_01));
		entries.add(new HeroResponse("Hellfire bitch", CRYSTAL_MAIDEN, R.raw.cm_lina_09));
		entries.add(new HeroResponse("Under that armor", CRYSTAL_MAIDEN, R.raw.cm_ally_06));
		entries.add(new HeroResponse("Your life lacked a point", DARK_SEER, R.raw.edkseer_kill_01));
		entries.add(new HeroResponse("Wasn't much", DARK_SEER, R.raw.dkseer_rare_03));
		entries.add(new HeroResponse("Laughter", DARK_SEER, R.raw.dkseer_laugh_10));
		entries.add(new HeroResponse("Dazzle!", DAZZLE, R.raw.dazz_ability_sfx_14));
		entries.add(new HeroResponse("Fissure man", EARTHSHAKER, R.raw.erth_ability_fissure_03));
		entries.add(new HeroResponse("Gonna pound you", EARTHSHAKER, R.raw.erth_attack_08));
		entries.add(new HeroResponse("Meeeeooowww", GYROCOPTER, R.raw.gyro_move_29));
		entries.add(new HeroResponse("Gagagagaga", GYROCOPTER, R.raw.gyro_attack_18));
		entries.add(new HeroResponse("Laughter", GYROCOPTER, R.raw.gyro_rocket_barrage_06));
		entries.add(new HeroResponse("Jakiro's copilot", GYROCOPTER, R.raw.gyro_ally_03));
		entries.add(new HeroResponse("Swallowed a bug", GYROCOPTER, R.raw.gyro_death_11));
		entries.add(new HeroResponse("Um shit!", GYROCOPTER, R.raw.gyro_death_16));
		entries.add(new HeroResponse("Get off my lawn", GYROCOPTER, R.raw.gyro_deny_05));
		entries.add(new HeroResponse("Manical laughter", GYROCOPTER, R.raw.gyro_laugh_11));
		entries.add(new HeroResponse("This bores me", INVOKER, R.raw.invo_move_23));
		entries.add(new HeroResponse("You dare fight me", INVOKER, R.raw.invo_attack_06));
		entries.add(new HeroResponse("Beacon of knowledge", INVOKER, R.raw.invo_level_05));
		entries.add(new HeroResponse("Laughter", INVOKER, R.raw.invo_level_13));
		entries.add(new HeroResponse("No match for my powers", INVOKER, R.raw.invo_kill_11));
		entries.add(new HeroResponse("The universe was not the same without me", INVOKER, R.raw.invo_respawn_05));
		entries.add(new HeroResponse("Ingenious Archmage, Carl", INVOKER, R.raw.invo_rare_05));
		entries.add(new HeroResponse("Size of the sword", JUGGERNAUT, R.raw.jugg_rival_01));
		entries.add(new HeroResponse("Fine line between bravery and stupidity", JUGGERNAUT, R.raw.jug_kill_09));
		entries.add(new HeroResponse("Jug or not", JUGGERNAUT, R.raw.jug_bottle_03));
		entries.add(new HeroResponse("I am the juggernaut, bitch", JUGGERNAUT, R.raw.jug_rare_06));
		entries.add(new HeroResponse("Laughter", KEEPER_OF_THE_LIGHT, R.raw.keep_kill_13));
		entries.add(new HeroResponse("Epic fail", KEEPER_OF_THE_LIGHT, R.raw.keep_death_10));
		entries.add(new HeroResponse("Splay your blood across", KUNKKA, R.raw.kunk_attack_04));
		entries.add(new HeroResponse("Back so soon", KUNKKA, R.raw.kunk_ability_xmark_03));
		entries.add(new HeroResponse("Fish and crits", KUNKKA, R.raw.kunk_item_10));
		entries.add(new HeroResponse("Rum in it", KUNKKA, R.raw.kunk_bottle_08));
		entries.add(new HeroResponse("Laughter", KUNKKA, R.raw.kunk_laugh_04));
		entries.add(new HeroResponse("That escalated quickly", LEGION_COMMANDER, R.raw.legcom_kill_14));
		entries.add(new HeroResponse("Son of a ...", LEGION_COMMANDER, R.raw.legcom_duelfailure_06));
		entries.add(new HeroResponse("Burn baby burn", LINA, R.raw.lina_kill_06));
		entries.add(new HeroResponse("Pathetic", LUNA, R.raw.luna_kill_11));
		entries.add(new HeroResponse("I came here for a battle", LUNA, R.raw.luna_kill_10));
		entries.add(new HeroResponse("Arr har har har", LUNA, R.raw.luna_laugh_06));
		entries.add(new HeroResponse("Nova? Nova?", LUNA, R.raw.luna_death_07));
		entries.add(new HeroResponse("Insignificant", LUNA, R.raw.luna_lasthit_07));
		entries.add(new HeroResponse("Laughter", LUNA, R.raw.luna_laugh_01));
		entries.add(new HeroResponse("Behold the horn of magnus", MAGNUS, R.raw.magn_spawn_06));
		entries.add(new HeroResponse("How dare you?", MAGNUS, R.raw.magn_lasthit_10));
		entries.add(new HeroResponse("Meepo! Meepo! ...", MEEPO, R.raw.meepo_divided_21));
		entries.add(new HeroResponse("Laughter", MEEPO, R.raw.meepo_levelup_13));
		entries.add(new HeroResponse("Size ain't everything", MEEPO, R.raw.meepo_kill_08));
		entries.add(new HeroResponse("Whimper, dogs", MIRANA, R.raw.mir_attack_07));
		entries.add(new HeroResponse("Nice kitty", MIRANA, R.raw.mir_rare_05));
		entries.add(new HeroResponse("We say no", MIRANA, R.raw.mir_deny_11));
		entries.add(new HeroResponse("Rot in hell", NECROPHOS, R.raw.necr_attack_05));
		entries.add(new HeroResponse("Feast for the flesh flies", NECROPHOS, R.raw.necr_kill_07));
		entries.add(new HeroResponse("Daywalker, Nightstalker", NIGHT_STALKER, R.raw.nstalk_move_07));
		entries.add(new HeroResponse("Nyx nyx nyx", NYX_ASSASSIN, R.raw.nyx_kill_17));
		entries.add(new HeroResponse("Good idea", OGRE_MAGI, R.raw.ogmag_move_14));
		entries.add(new HeroResponse("Hittin' stuff is fun", OGRE_MAGI, R.raw.ogmag_attack_04));
		entries.add(new HeroResponse("Eeeeyahhh", OGRE_MAGI, R.raw.ogmag_ability_bloodlust_04));
		entries.add(new HeroResponse("Skillshot", OGRE_MAGI, R.raw.ogmag_ability_multi_06));
		entries.add(new HeroResponse("And again and again", OGRE_MAGI, R.raw.ogmag_ability_multi_hit_07));
		entries.add(new HeroResponse("Double damn it", OGRE_MAGI, R.raw.ogmag_ability_failure_09));
		entries.add(new HeroResponse("We outsmarted them", OGRE_MAGI, R.raw.ogmag_kill_05));
		entries.add(new HeroResponse("Selfish", OGRE_MAGI, R.raw.ogmag_lasthit_01));
		entries.add(new HeroResponse("Dee nied", OGRE_MAGI, R.raw.ogmag_deny_17));
		entries.add(new HeroResponse("We didnt need...", OGRE_MAGI, R.raw.ogmag_thanks_02));
		entries.add(new HeroResponse("Laughter", OGRE_MAGI, R.raw.ogmag_laugh_04));
		entries.add(new HeroResponse("Game of some sort", PUCK, R.raw.puck_spawn_05));
		entries.add(new HeroResponse("Stay and amuse me", PUCK, R.raw.puck_attack_11));
		entries.add(new HeroResponse("Silence", PUCK, R.raw.puck_ability_rift_02));
		entries.add(new HeroResponse("Bye-bye", PUCK, R.raw.puck_ability_phase_03));
		entries.add(new HeroResponse("They call me the butcher", PUDGE, R.raw.pud_spawn_03));
		entries.add(new HeroResponse("So much meat, so little time", PUDGE, R.raw.pud_spawn_09));
		entries.add(new HeroResponse("Get over here", PUDGE, R.raw.pud_ability_hook_04));
		entries.add(new HeroResponse("I meant to do that", PUDGE, R.raw.pud_ability_hook_miss_01));
		entries.add(new HeroResponse("Oops, was that me?", PUDGE, R.raw.pud_ability_rot_07));
		entries.add(new HeroResponse("Fresh meat!", PUDGE, R.raw.pud_ability_devour_16));
		entries.add(new HeroResponse("Bloody hell", PUDGE, R.raw.pud_death_07));
		entries.add(new HeroResponse("Look, a spare rib", PUDGE, R.raw.pud_kill_11));
		entries.add(new HeroResponse("What happened", PUDGE, R.raw.pud_respawn_09));
		entries.add(new HeroResponse("Denied", PUDGE, R.raw.pud_deny_05));
		entries.add(new HeroResponse("Thanks meat", PUDGE, R.raw.pud_thanks_03));
		entries.add(new HeroResponse("Laughter", PUDGE, R.raw.pud_laugh_06));
		entries.add(new HeroResponse("Incompetence", PUGNA, R.raw.pugna_ability_nward_10));
		entries.add(new HeroResponse("There will be pain", QUEEN_OF_PAIN, R.raw.pain_spawn_02));
		entries.add(new HeroResponse("Laughter", QUEEN_OF_PAIN, R.raw.pain_levelup_09));
		entries.add(new HeroResponse("Did you say stop?", QUEEN_OF_PAIN, R.raw.pain_kill_13));
		entries.add(new HeroResponse("Come get met", QUEEN_OF_PAIN, R.raw.pain_taunt_01));
		entries.add(new HeroResponse("No no no", SHADOW_FIEND, R.raw.nev_death_17));
		entries.add(new HeroResponse("Neia teia an da ka", SHADOW_SHAMAN, R.raw.shad_ability_shackle_08));
		entries.add(new HeroResponse("Bukaaww! Bukaww", SHADOW_SHAMAN, R.raw.shad_ability_voodoo_06));
		entries.add(new HeroResponse("Heeyaah", SHADOW_SHAMAN, R.raw.shad_ability_ether_03));
		entries.add(new HeroResponse("You've thought this through?", SKYWRATH_MAGE, R.raw.drag_move_16));
		entries.add(new HeroResponse("Laughter", SLARDAR, R.raw.slar_level_07));
		entries.add(new HeroResponse("Nice one", SLARK, R.raw.slark_move_15));
		entries.add(new HeroResponse("Here fishy-fishy", SLARK, R.raw.slark_attack_13));
		entries.add(new HeroResponse("This is going swimmingly", SLARK, R.raw.slark_levelup_04));
		entries.add(new HeroResponse("Dont mind if I do", SLARK, R.raw.slark_lasthit_03));
		entries.add(new HeroResponse("Laughter", SLARK, R.raw.slark_laugh_05));
		entries.add(new HeroResponse("Time for target practice", SNIPER, R.raw.snip_spawn_03));
		entries.add(new HeroResponse("Shoot em up", SNIPER, R.raw.snip_attack_08));
		entries.add(new HeroResponse("Bullseye", SNIPER, R.raw.snip_kill_03));
		entries.add(new HeroResponse("Laughter", SNIPER, R.raw.snip_kill_12));
		entries.add(new HeroResponse("Sniper reloaded", SNIPER, R.raw.snip_respawn_11));
		entries.add(new HeroResponse("Handsome devil", STORM_SPIRIT, R.raw.ss_ability_static_01));
		entries.add(new HeroResponse("Huzzah", STORM_SPIRIT, R.raw.ss_win_05));
		entries.add(new HeroResponse("Laughter", STORM_SPIRIT, R.raw.ss_laugh_03));
		entries.add(new HeroResponse("Touche", STORM_SPIRIT, R.raw.ss_ability_lightning_21));
		entries.add(new HeroResponse("You should not have crossed me", SVEN, R.raw.sven_kill_01));
		entries.add(new HeroResponse("What did we learn from this", SVEN, R.raw.sven_respawn_02));
		entries.add(new HeroResponse("Going to be absurd", SVEN, R.raw.sven_item_05));
		entries.add(new HeroResponse("True friend", SVEN, R.raw.sven_thanks_01));
		entries.add(new HeroResponse("Laughter", TECHIES, R.raw.tech_move_52));
		entries.add(new HeroResponse("Whoopsie", TECHIES, R.raw.tech_suicidesquad_11));
		entries.add(new HeroResponse("Booom", TECHIES, R.raw.tech_focuseddetonate_13));
		entries.add(new HeroResponse("So beautiful", TECHIES, R.raw.tech_focuseddetonate_11));
		entries.add(new HeroResponse("Can't believe it worked", TECHIES, R.raw.tech_focuseddetonate_19));
		entries.add(new HeroResponse("Eureka", TECHIES, R.raw.tech_focuseddetonate_21));
		entries.add(new HeroResponse("Laughter 2", TECHIES, R.raw.tech_kill_23));
		entries.add(new HeroResponse("Dont hit that button", TECHIES, R.raw.tech_rare_01));
		entries.add(new HeroResponse("It's a trap", TEMPLAR_ASSASSIN, R.raw.temp_psionictrap_04));
		entries.add(new HeroResponse("Spoilers", TEMPLAR_ASSASSIN, R.raw.temp_death_13));
		entries.add(new HeroResponse("Ha ha ha", TEMPLAR_ASSASSIN, R.raw.temp_laugh_04));
		entries.add(new HeroResponse("Look out, a tree", TERRORBLADE, R.raw.terr_ally_02));
		entries.add(new HeroResponse("Women and children and Kunkka first", TIDEHUNTER, R.raw.tide_rival_24));
		entries.add(new HeroResponse("Kunkkaaa", TIDEHUNTER, R.raw.tide_rival_04));
		entries.add(new HeroResponse("Trees out there", TIMBERSAW, R.raw.timb_spawn_04));
		entries.add(new HeroResponse("Are you sure about this", TIMBERSAW, R.raw.timb_move_05));
		entries.add(new HeroResponse("That one looks angry", TIMBERSAW, R.raw.timb_move_08));
		entries.add(new HeroResponse("Do I have to?", TIMBERSAW, R.raw.timb_move_17));
		entries.add(new HeroResponse("Woooh!", TIMBERSAW, R.raw.timb_timberchain_07));
		entries.add(new HeroResponse("Cut cut cut", TIMBERSAW, R.raw.timb_kill_01));
		entries.add(new HeroResponse("This is not happening", TIMBERSAW, R.raw.timb_death_18));
		entries.add(new HeroResponse("This is what I always wanted", TIMBERSAW, R.raw.timb_drop_rare_02));
		entries.add(new HeroResponse("Clinker", TINKER, R.raw.tink_spawn_06));
		entries.add(new HeroResponse("Are you thinkin' what I'm thinkin", TINKER, R.raw.tink_move_12));
		entries.add(new HeroResponse("Pew, pew, pew pew pew!", TINKER, R.raw.tink_ability_laser_03));
		entries.add(new HeroResponse("Which of us has the degree", TINKER, R.raw.tink_kill_13));
		entries.add(new HeroResponse("Melting point of Crystal Maiden", TINKER, R.raw.tink_rival_11));
		entries.add(new HeroResponse("I tink. Therefore I am", TINKER, R.raw.tink_respawn_08));
		entries.add(new HeroResponse("Time to reboot and kick butt", TINKER, R.raw.tink_travel_06));
		entries.add(new HeroResponse("Laughter", TINKER, R.raw.tink_deny_09));
		entries.add(new HeroResponse("Hrauuuugggh", URSA, R.raw.ursa_spawn_11));
		entries.add(new HeroResponse("Death is my bitch", WRAITH_KING, R.raw.wraith_move_09));
		entries.add(new HeroResponse("Deal with it", WRAITH_KING, R.raw.wraith_kill_11));
		entries.add(new HeroResponse("Now I get to shoot stuff", WINDRANGER, R.raw.wind_battlebegins_01));
		entries.add(new HeroResponse("Shishkebab", WINDRANGER, R.raw.wind_ability_shackleshot_08));
		entries.add(new HeroResponse("Pronounce you man and tree", WINDRANGER, R.raw.wind_ability_shackleshot_02));
		entries.add(new HeroResponse("You hit a girl", WINDRANGER, R.raw.wind_death_04));
		entries.add(new HeroResponse("Why do you hate gingers", WINDRANGER, R.raw.wind_death_05));
		entries.add(new HeroResponse("Could be worse", WINDRANGER, R.raw.wind_kill_11));
		entries.add(new HeroResponse("Laughter", WINDRANGER, R.raw.wind_laugh_10));
		entries.add(new HeroResponse("The doctor is in", WITCH_DOCTOR, R.raw.wdoc_spawn_01));
		entries.add(new HeroResponse("Look at it go", WITCH_DOCTOR, R.raw.wdoc_ability_cask_06));
		entries.add(new HeroResponse("Feelin good man", WITCH_DOCTOR, R.raw.wdoc_level_08));
		entries.add(new HeroResponse("Stick a bone in it, your're done", WITCH_DOCTOR, R.raw.wdoc_kill_11));
		entries.add(new HeroResponse("He's about to pop", WITCH_DOCTOR, R.raw.wdoc_killspecial_02));
		entries.add(new HeroResponse("Nononono", WITCH_DOCTOR, R.raw.wdoc_deny_02));
		entries.add(new HeroResponse("Oyeaaaahh", WITCH_DOCTOR, R.raw.wdoc_laugh_03));
		entries.add(new HeroResponse("You cant run from heaven", ZEUS, R.raw.zuus_ability_thunder_02));
		entries.add(new HeroResponse("Laughter", ZEUS, R.raw.zuus_kill_15));
		entries.add(new HeroResponse("Welcome to Ota", GLADOS, R.raw.glados_ann_glados_prelim_06));
		entries.add(new HeroResponse("Like chess", GLADOS, R.raw.glados_ann_glados_prelim_18));
		entries.add(new HeroResponse("Poorly chosen team", GLADOS, R.raw.glados_ann_glados_team_complete_yr_follow_03));
		entries.add(new HeroResponse("Who will win?", GLADOS, R.raw.glados_ann_glados_battle_begin_follow));
		entries.add(new HeroResponse("Team of living people", GLADOS, R.raw.glados_killing_spree_ann_glados_allied_teamwipe_04));
		entries.add(new HeroResponse("Enemy wipe", GLADOS, R.raw.glados_killing_spree_ann_glados_enemy_teamwipe_04));
		entries.add(new HeroResponse("You solve dota", GLADOS, R.raw.glados_ann_glados_vict_follow_05));
		entries.add(new HeroResponse("Big deal", GLADOS, R.raw.glados_ann_glados_vict_follow_04));
		entries.add(new HeroResponse("Dota play-by-play", GLADOS, R.raw.glados_ann_glados_spectat_06));
		entries.add(new HeroResponse("Doesn't know what they are doing", GLADOS, R.raw.glados_ann_glados_ally_neg_08));
		entries.add(new HeroResponse("Interesting strategy", GLADOS, R.raw.glados_ann_glados_ally_neg_18));
		entries.add(new HeroResponse("Elaborate trap", GLADOS, R.raw.glados_ann_glados_event_neg_15));
		entries.add(new HeroResponse("Nobody cares", GLADOS, R.raw.glados_ann_glados_ally_pos_07));
		entries.add(new HeroResponse("Good feeling", GLADOS, R.raw.glados_ann_glados_ally_pos_20));
		entries.add(new HeroResponse("You're winning", GLADOS, R.raw.glados_ann_glados_ally_pos_31));
		entries.add(new HeroResponse("Respawner traffic", GLADOS, R.raw.glados_ann_glados_followup_respaw_04));
		entries.add(new HeroResponse("I thought you were dead", GLADOS, R.raw.glados_ann_glados_followup_respaw_13));
		entries.add(new HeroResponse("I hope you're proud of yourself", GLADOS, R.raw.glados_killing_spree_ann_glados_kill_dominate_01));
		entries.add(new HeroResponse("What you're doing is wrong", GLADOS, R.raw.glados_killing_spree_ann_glados_kill_holy_03));
		entries.add(new HeroResponse("Great teamwork", GLADOS, R.raw.glados_killing_spree_ann_glados_kill_ownage_01));
		
		return toMap(entries);

	}

}
