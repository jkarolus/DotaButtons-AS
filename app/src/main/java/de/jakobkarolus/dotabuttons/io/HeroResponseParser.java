package de.jakobkarolus.dotabuttons.io;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.Vector;

import de.jakobkarolus.dotabuttons.R;
import de.jakobkarolus.dotabuttons.model.DotaButtonsCategory;
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
import static de.jakobkarolus.dotabuttons.model.Heroes.BULLDOG;
import static de.jakobkarolus.dotabuttons.model.Heroes.CLOCKWERK;
import static de.jakobkarolus.dotabuttons.model.Heroes.CREEP;
import static de.jakobkarolus.dotabuttons.model.Heroes.CRYSTAL_MAIDEN;
import static de.jakobkarolus.dotabuttons.model.Heroes.DARK_SEER;
import static de.jakobkarolus.dotabuttons.model.Heroes.DAZZLE;
import static de.jakobkarolus.dotabuttons.model.Heroes.EARTHSHAKER;
import static de.jakobkarolus.dotabuttons.model.Heroes.EARTH_SPIRIT;
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
import static de.jakobkarolus.dotabuttons.model.Heroes.LION;
import static de.jakobkarolus.dotabuttons.model.Heroes.LUNA;
import static de.jakobkarolus.dotabuttons.model.Heroes.MAGNUS;
import static de.jakobkarolus.dotabuttons.model.Heroes.MEEPO;
import static de.jakobkarolus.dotabuttons.model.Heroes.MIRANA;
import static de.jakobkarolus.dotabuttons.model.Heroes.MISC;
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
import static de.jakobkarolus.dotabuttons.model.Heroes.SINGSING;
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
	 * @param startId startId in the database for this category
	 * @return {@link java.util.Map} of {@link List} of {@link HeroResponse} sorted alphabetically
	 */
	public static DotaButtonsCategory loadReporterResponseData(long startId){

        List<HeroResponse> entries = new Vector<>();

        long id=startId;
        entries.add(new HeroResponse(id++, "I don't like magic", ANTIMAGE, R.raw.anti_mage_dont_like_magic));
        entries.add(new HeroResponse(id++, "Is this your card", ANTIMAGE, R.raw.anti_mage_is_this_your_card));
        entries.add(new HeroResponse(id++, "Cleanup time!", ANTIMAGE, R.raw.anti_mage_cleanup_time));
        entries.add(new HeroResponse(id++, "Steroid creeps", ANTIMAGE, R.raw.anti_mage_steroid_creeps));
        entries.add(new HeroResponse(id++, "I have finished farming.", ANTIMAGE, R.raw.anti_mage_finished_farming));
        entries.add(new HeroResponse(id++, "This is a team game?", REPORTER, R.raw.reporter_this_is_a_team_game));
        entries.add(new HeroResponse(id++, "Magic paper", REPORTER, R.raw.reporter_magic_paper));
        entries.add(new HeroResponse(id++, "F* your shit, I'm a siege creep.", REPORTER, R.raw.reporter_siege_creep));
        entries.add(new HeroResponse(id++, "Demon edge, sacred relic", REPORTER, R.raw.reporter_divine_rapier));
        entries.add(new HeroResponse(id++, "Regret my decision", REPORTER, R.raw.reporter_decision_regret));
        entries.add(new HeroResponse(id++, "Terrorblade farming", REPORTER, R.raw.reporter_terror_farming));
        entries.add(new HeroResponse(id++, "Hello, I'm Ymir the tusk.", TUSK, R.raw.tusk_hello));

		entries.add(new HeroResponse(id++, "Shoot him!", ENIGMA, R.raw.engima_enemy_closing_in));
		entries.add(new HeroResponse(id++, "Activate! Blink! Go!", ENIGMA, R.raw.engima_blink));
		entries.add(new HeroResponse(id++, "Nyctasha", BANE, R.raw.bane_nyctasha));
		entries.add(new HeroResponse(id++, "Engima in the jungle", ENIGMA, R.raw.enigma_in_the_jungle));
		entries.add(new HeroResponse(id++, "Grand Magus.", RUBICK, R.raw.rubick_grand_magus));
		entries.add(new HeroResponse(id++, "Got 'em", RUBICK, R.raw.rubick_got_em));
		entries.add(new HeroResponse(id++, "What are you hookin' me for?", PUDGE, R.raw.pudge_creep_hook));
		entries.add(new HeroResponse(id++, "Missing middle!", PUDGE, R.raw.pudge_lane_missing_02));
		entries.add(new HeroResponse(id++, "Keep doin' what you're doin'", ENIGMA, R.raw.enigma_rubick_keep_doing));
		entries.add(new HeroResponse(id++, "Rubick, you're a crazy f*, aren't you", ENIGMA, R.raw.engima_rubick_crazy));
		entries.add(new HeroResponse(id++, "Really good hooker", RUBICK, R.raw.rubick_good_hooker));
		entries.add(new HeroResponse(id++, "Haha you're stunned!", ENIGMA, R.raw.enigma_haha_stunned));
		entries.add(new HeroResponse(id++, "The art of echo-location", FACELESS_VOID, R.raw.void_echo_location));
		entries.add(new HeroResponse(id++, "Accept this and move on", RUBICK, R.raw.rubick_accept_and_move_on));
		entries.add(new HeroResponse(id++, "Gank some fools", ENIGMA, R.raw.engima_gank_some_fools));
		entries.add(new HeroResponse(id++, "Gee, I love living!", CREEP, R.raw.creep_love_living));
		entries.add(new HeroResponse(id++, "Bristles on me back", BRISTLEBACK, R.raw.bristleback_bristles_on_back));
		entries.add(new HeroResponse(id++, "Cotton candy", INVOKER, R.raw.invoker_cotton_candy));
		entries.add(new HeroResponse(id++, "I don't even know how I got here", GYROCOPTER, R.raw.gyrocopter_how_i_got_here));
		entries.add(new HeroResponse(id++, "I was here third!", GYROCOPTER, R.raw.gyrocopter_third));
		entries.add(new HeroResponse(id++, "Food to the opposing team", INVOKER, R.raw.invoker_food));
		entries.add(new HeroResponse(id++, "No sense at all", BRISTLEBACK, R.raw.bristleback_no_sense_at_all));
		entries.add(new HeroResponse(id++, "Gimmie gimmie gimmie", GYROCOPTER, R.raw.gyrocopter_mine));
		entries.add(new HeroResponse(id++, "I'll report you", RUBICK, R.raw.rubick_report));
		entries.add(new HeroResponse(id++, "Mustache", GYROCOPTER, R.raw.gyrocopter_mustache));
		entries.add(new HeroResponse(id++, "Enigma in the jungle 2", ENIGMA, R.raw.engima_jungle_2));
		entries.add(new HeroResponse(id++, "New meta", NATURES_PROPHET, R.raw.prophet_new_meta));
		entries.add(new HeroResponse(id++, "Game is hard", NATURES_PROPHET, R.raw.prophet_game_is_hard));
		entries.add(new HeroResponse(id++, "Pew pew pew", GYROCOPTER, R.raw.gyrocopter_pew_pew_pew));
		entries.add(new HeroResponse(id++, "GG branch", INVOKER, R.raw.invoker_gg_branch));
		entries.add(new HeroResponse(id++, "Wex exort exort", INVOKER, R.raw.invoker_wex_exort_exort));
		entries.add(new HeroResponse(id++, "Keep your eyes peeled", RUBICK, R.raw.rubick_eyes_peeled));
		entries.add(new HeroResponse(id++, "Oh my gawd", ENIGMA, R.raw.enigma_omg));
		entries.add(new HeroResponse(id++, "Exort exort exort", INVOKER, R.raw.invoker_exort_exort_exort));
		entries.add(new HeroResponse(id++, "Biological warfare", INVOKER, R.raw.invoker_biological_warfare));
		entries.add(new HeroResponse(id++, "Euls scepter of divinity", INVOKER, R.raw.invoker_euls));
		entries.add(new HeroResponse(id++, "I f* love drumming", GYROCOPTER, R.raw.gyrocopter_love_drumming));
		entries.add(new HeroResponse(id++, "I'm a mass murderer", GYROCOPTER, R.raw.gyrocopter_mass_murderer));
		entries.add(new HeroResponse(id++, "Immortalitah", GYROCOPTER, R.raw.gyrocopter_immortalitah));
		entries.add(new HeroResponse(id++, "I've got the aegis, bitches", GYROCOPTER, R.raw.gyrocopter_aegis));
		entries.add(new HeroResponse(id++, "Panic drums panic", GYROCOPTER, R.raw.gyrocopter_panic_drums_panic));
		entries.add(new HeroResponse(id++, "I don't understand you", GYROCOPTER, R.raw.gyrocopter_language_understand));
		entries.add(new HeroResponse(id++, "Oink oink oink", ENIGMA, R.raw.enigma_oink));
		entries.add(new HeroResponse(id++, "Nobody temporarily ends my life", GYROCOPTER, R.raw.gyrocopter_temporarily_end_life));
		entries.add(new HeroResponse(id++, "Shiny red bullets", GYROCOPTER, R.raw.gyrocopter_red_bullets));
		entries.add(new HeroResponse(id++, "Operation SNPUHHPRZ", GYROCOPTER, R.raw.gyrocopter_operation_snpuhhprz));
		entries.add(new HeroResponse(id++, "Surprise shitpickle", GYROCOPTER, R.raw.gyrocopter_suprise_shitpickle));
		entries.add(new HeroResponse(id++, "More easily overestimate my tankiness", BRISTLEBACK, R.raw.bristleback_overestimate_tankiness));
		entries.add(new HeroResponse(id++, "Universe not the same without me", INVOKER, R.raw.invoker_universe_not_the_same));
		entries.add(new HeroResponse(id++, "Relocated to a new location", INVOKER, R.raw.invoker_relocate));
		entries.add(new HeroResponse(id++, "GG please end quickly", INVOKER, R.raw.invoker_gg_end_quickly));
		entries.add(new HeroResponse(id++, "Dota in a nutshell", ENIGMA, R.raw.enigma_dota_nutshell));
		entries.add(new HeroResponse(id++, "Arcane boots", RUBICK, R.raw.rubick_arcane_boots));
		entries.add(new HeroResponse(id++, "Deafening blast", ENIGMA, R.raw.enigma_def_blast));
		entries.add(new HeroResponse(id++, "Manta style", GYROCOPTER, R.raw.gyrocopter_manta_style));
		entries.add(new HeroResponse(id++, "Rocket ships", ENIGMA, R.raw.enigma_rocket_ships));
		entries.add(new HeroResponse(id++, "Meep mop defense system", RUBICK, R.raw.rubick_meep_mop));
		entries.add(new HeroResponse(id++, "Meeega creeps", ENIGMA, R.raw.enigma_mega_creeps));
		entries.add(new HeroResponse(id++, "Throw", GYROCOPTER, R.raw.gyrocopter_throw));
		entries.add(new HeroResponse(id++, "The reason I lost", INVOKER, R.raw.invoker_reason_lost));
		entries.add(new HeroResponse(id++, "Let's abandon", RUBICK, R.raw.rubick_abandon));
		entries.add(new HeroResponse(id++, "Pirate hat", TIDEHUNTER, R.raw.tidehunter_pirate_hat));
		entries.add(new HeroResponse(id++, "Octohead, sharkyback and squintbuddy", TIDEHUNTER, R.raw.tidehunter_octohead_sharkybag_squintbuddy));
		entries.add(new HeroResponse(id++, "Whitty remark about first blood", JUGGERNAUT, R.raw.juggernaut_first_blood));
		entries.add(new HeroResponse(id++, "Look, a tree", TIMBERSAW, R.raw.timbersaw_tree));
		entries.add(new HeroResponse(id++, "Eject", TIMBERSAW, R.raw.timbersaw_eject));
		entries.add(new HeroResponse(id++, "Axe is axe", AXE, R.raw.axe_interview));
		entries.add(new HeroResponse(id++, "Free farmin'", JUGGERNAUT, R.raw.juggernaut_free_farming));
		entries.add(new HeroResponse(id++, "Axehole", TERRORBLADE, R.raw.terrorblade_axehole));
		entries.add(new HeroResponse(id++, "He was gone just like that", ENIGMA, R.raw.enigma_he_was_gone));
		entries.add(new HeroResponse(id++, "Friends help kill Kunkka", TIDEHUNTER, R.raw.tidehunter_kunkka_kill));
		entries.add(new HeroResponse(id++, "Tidehunter okay", TIDEHUNTER, R.raw.tidehunter_okay));
		entries.add(new HeroResponse(id++, "Who's the carry", TERRORBLADE, R.raw.terrorblade_i_am_the_carry));
		entries.add(new HeroResponse(id++, "Badass flaming footsteps", TERRORBLADE, R.raw.terrorblade_badass_footsteps));
		entries.add(new HeroResponse(id++, "I can do it, too", TERRORBLADE, R.raw.terrorblade_illusion));
		entries.add(new HeroResponse(id++, "What are you gonna do about it?", SHOPKEEPER, R.raw.shopkeeper_bitch));
		entries.add(new HeroResponse(id++, "Naah", PUDGE, R.raw.pudge_naah));
		entries.add(new HeroResponse(id++, "What a rip-off", TERRORBLADE, R.raw.terrorblade_what_a_ripoff));
		entries.add(new HeroResponse(id++, "I'll get over it", TERRORBLADE, R.raw.terrorblade_ill_get_over_it));
		entries.add(new HeroResponse(id++, "Terrorblade in the jungle", TERRORBLADE, R.raw.terrorblade_in_the_jungle));
		entries.add(new HeroResponse(id++, "What's makin' all that ruckus", TERRORBLADE, R.raw.terrorblade_making_all_that_ruckus));
		
		//Version 1.1
		boolean newVersion = false;
		entries.add(new HeroResponse(id++, "Gooooold!", KUNKKA, R.raw.kunkka_gold, false));
		entries.add(new HeroResponse(id++, "Dota 1 thing", KUNKKA, R.raw.kunkka_dota1_thing, false));
		entries.add(new HeroResponse(id++, "Buuuurn", ENIGMA, R.raw.enigma_burn, false));
		entries.add(new HeroResponse(id++, "Retreat with an advantage", ENIGMA, R.raw.enigma_advantage, false));
		entries.add(new HeroResponse(id++, "Poor piggy", TIDEHUNTER, R.raw.tide_poor_piggy, false));
		entries.add(new HeroResponse(id++, "Blink dagger, where are you?", TIDEHUNTER, R.raw.tide_blink_dagger, false));
		entries.add(new HeroResponse(id++, "Allergic to total ownage", TERRORBLADE, R.raw.terrorblade_total_ownage, false));
		entries.add(new HeroResponse(id++, "Totally worth it", TERRORBLADE, R.raw.terrorblade_worth_it, false));
		entries.add(new HeroResponse(id++, "My own eidolons", RUBICK, R.raw.rubick_own_eidolons, false));
		entries.add(new HeroResponse(id++, "Oh gawd, oh man", ENIGMA, R.raw.enigma_oh_gawd_oh_man, false));
		entries.add(new HeroResponse(id++, "Super creeps", CREEP, R.raw.creep_super_creep, false));
		entries.add(new HeroResponse(id++, "Puny and regular", CREEP, R.raw.creep_puny_and_regular, false));
		entries.add(new HeroResponse(id++, "Wow amazing", ENIGMA, R.raw.enigma_amazing, false));
		entries.add(new HeroResponse(id++, "That was lame", JUGGERNAUT, R.raw.jugg_lame, false));
		entries.add(new HeroResponse(id++, "Chu Chu!", TIMBERSAW, R.raw.timbersaw_chu_chu, false));
		entries.add(new HeroResponse(id++, "Smoke train", TIMBERSAW, R.raw.timbersaw_smoke_train2, false));
		entries.add(new HeroResponse(id++, "Chu chu honk!", TIMBERSAW, R.raw.timbersaw_smoke_train, false));
		entries.add(new HeroResponse(id++, "Flying fuck", ENIGMA, R.raw.enigma_flying_fuck, false));
		entries.add(new HeroResponse(id++, "Just act normal", TIDEHUNTER, R.raw.tide_act_normal, false));
		entries.add(new HeroResponse(id++, "Here to save the ...", JUGGERNAUT, R.raw.jugg_safe_the_day, false));
		entries.add(new HeroResponse(id++, "Enigma kick", ENIGMA, R.raw.enigma_kick, false));
		entries.add(new HeroResponse(id++, "You and me Rubick", ENIGMA, R.raw.enigma_you_and_me, false));
		entries.add(new HeroResponse(id++, "Fuck wards", ENIGMA, R.raw.enigma_fuck_wards, false));
		entries.add(new HeroResponse(id++, "Gameplay depth", ENIGMA, R.raw.enigma_gameplay_depth, false));
		entries.add(new HeroResponse(id++, "Sorry", TIDEHUNTER, R.raw.tidehunter_sorry, false));
		entries.add(new HeroResponse(id++, "Bloodstone", TIMBERSAW, R.raw.timbersaw_bloodstone, false));
        entries.add(new HeroResponse(id++, "Delaying the inevitable", ENIGMA, R.raw.enigma_delaying_inevitable, false));

        //Version 1.3
        newVersion = false;
        entries.add(new HeroResponse(id++, "Noooo", TIDEHUNTER, R.raw.tide_noo, newVersion));
        entries.add(new HeroResponse(id++, "Mask on my mask", JUGGERNAUT, R.raw.jugg_mask_on_mask, newVersion));
        entries.add(new HeroResponse(id++, "Smack em", ENIGMA, R.raw.enigma_smack_em, newVersion));
        entries.add(new HeroResponse(id++, "Commended for Leadership", TIMBERSAW, R.raw.timber_commended, newVersion));
        entries.add(new HeroResponse(id++, "Your life is now validated", TIMBERSAW, R.raw.timber_life_validated, newVersion));
        entries.add(new HeroResponse(id++, "Commended for being forgiving", KUNKKA, R.raw.kunkka_forgiving, newVersion));
        entries.add(new HeroResponse(id++, "I liked the part where you pressed R", JUGGERNAUT, R.raw.jugger_part_pressed_r, newVersion));
        entries.add(new HeroResponse(id++, "Seeking commendations", KUNKKA, R.raw.kunkka_commendations, newVersion));

        //Version 1.4
        newVersion = false;
        entries.add(new HeroResponse(id++, "I forgot he had that ability", TIMBERSAW, R.raw.timber_forgot_ability, newVersion));
        entries.add(new HeroResponse(id++, "You should be nicer to people", TIMBERSAW, R.raw.timber_nevaaa, newVersion));
        entries.add(new HeroResponse(id++, "Backdoor protection system", TIMBERSAW, R.raw.timber_backdoor_protection, newVersion));
        entries.add(new HeroResponse(id++, "Oh boy", TIMBERSAW, R.raw.timber_oh_boy, newVersion));
        entries.add(new HeroResponse(id++, "Hi doggy", ENIGMA, R.raw.enigma_hi_doggy, newVersion));
        entries.add(new HeroResponse(id++, "Cosmetics", ENIGMA, R.raw.enigma_cosmetics, newVersion));
        entries.add(new HeroResponse(id++, "It's about 30 dollars", REPORTER, R.raw.reporter_30_dollars, newVersion));
        entries.add(new HeroResponse(id++, "Don't do business with the enemy!", TIMBERSAW, R.raw.timber_traitor, newVersion));
        entries.add(new HeroResponse(id++, "Uhh snazzy!", TERRORBLADE, R.raw.terrorblade_snazzy, newVersion));
        entries.add(new HeroResponse(id++, "Zeus, use your ultimate", ENIGMA, R.raw.enigma_zeus_utli, newVersion));
        entries.add(new HeroResponse(id++, "Nevaaa!", TIMBERSAW, R.raw.timber_nevaaa_2, newVersion));

		//Version 1.5
		newVersion = true;
		entries.add(new HeroResponse(id++, "He had many scepters", TIMBERSAW, R.raw.timb_scepter, newVersion));
		entries.add(new HeroResponse(id++, "Didnt realize I was alive", TIDEHUNTER, R.raw.tide_alive, newVersion));
		entries.add(new HeroResponse(id++, "Refresher", ENIGMA, R.raw.engima_refresher, newVersion));
		entries.add(new HeroResponse(id++, "Still have the aegis", JUGGERNAUT, R.raw.jugger_aegis, newVersion));
		entries.add(new HeroResponse(id++, "Get home quickly", TIMBERSAW, R.raw.timber_home_quickly, newVersion));
		entries.add(new HeroResponse(id++, "Nooo!", RUBICK, R.raw.rubick_nooo, newVersion));
		entries.add(new HeroResponse(id++, "Autoattack", RUBICK, R.raw.rubick_autoattack, newVersion));
		entries.add(new HeroResponse(id++, "Gank squad", REPORTER, R.raw.reporter_gank_squad, newVersion));
		entries.add(new HeroResponse(id++, "Farming creeps", RUBICK, R.raw.rubick_farming_creeps, newVersion));
		entries.add(new HeroResponse(id++, "Aghanims was my father", RUBICK, R.raw.rubick_lore, newVersion));
		entries.add(new HeroResponse(id++, "Nerd", CREEP, R.raw.creep_nerd, newVersion));
		entries.add(new HeroResponse(id++, "Do the thing", ENIGMA, R.raw.enigma_do_the_thing, newVersion));
		entries.add(new HeroResponse(id++, "Yeah", TIDEHUNTER, R.raw.tide_yeah, newVersion));
		entries.add(new HeroResponse(id++, "That was for my effigy", KUNKKA, R.raw.kunkka_effigy, newVersion));
		entries.add(new HeroResponse(id++, "Quote your KDA", KUNKKA, R.raw.kunkka_kda, newVersion));
		entries.add(new HeroResponse(id++, "Black hole bluff", ENIGMA, R.raw.enigma_black_hole_bluff, newVersion));
		entries.add(new HeroResponse(id++, "So close", KUNKKA, R.raw.kunkka_so_close, newVersion));
		entries.add(new HeroResponse(id++, "He does it!", TERRORBLADE, R.raw.terrorblade_win_international, newVersion));
		entries.add(new HeroResponse(id++, "Hi, I am Gyrocopter", GYROCOPTER, R.raw.gyro_gyrocopter, newVersion));
		entries.add(new HeroResponse(id++, "In the bag", LION, R.raw.lion_bag, newVersion));
		entries.add(new HeroResponse(id++, "In the bag", RUBICK, R.raw.rubick_bag, newVersion));
		entries.add(new HeroResponse(id++, "You're fugly as all hell", GYROCOPTER, R.raw.gyro_lion_ugly, newVersion));
		entries.add(new HeroResponse(id++, "Damn", GYROCOPTER, R.raw.gyro_damn, newVersion));
		entries.add(new HeroResponse(id++, "I'm in the bag", GYROCOPTER, R.raw.gyro_bag, newVersion));
		entries.add(new HeroResponse(id++, "In the bag", SKYWRATH_MAGE, R.raw.sky_bag, newVersion));
		entries.add(new HeroResponse(id++, "Not playing with you again", INVOKER, R.raw.invoker_not_playing, newVersion));
		entries.add(new HeroResponse(id++, "Let's go", CREEP, R.raw.creep_lets_go, newVersion));
		entries.add(new HeroResponse(id++, "Commander Tresdin reporting", LEGION_COMMANDER, R.raw.legion_reporting, newVersion));
		entries.add(new HeroResponse(id++, "Let's lionize these wimps", LION, R.raw.lion_lionize, newVersion));
		entries.add(new HeroResponse(id++, "Annoying fuckers", GYROCOPTER, R.raw.gyro_annoying_fuckers, newVersion));
		entries.add(new HeroResponse(id++, "The other ward", RUBICK, R.raw.rubick_other_ward, newVersion));
		entries.add(new HeroResponse(id++, "Jupada", GYROCOPTER, R.raw.gyro_wupada, newVersion));
		entries.add(new HeroResponse(id++, "That means yes", TECHIES, R.raw.techies_means_yes, newVersion));
		entries.add(new HeroResponse(id++, "Landmines", RUBICK, R.raw.rubick_landmines, newVersion));
		entries.add(new HeroResponse(id++, "Enigma in the fountain", ENIGMA, R.raw.engima_fountain, newVersion));
		entries.add(new HeroResponse(id++, "It's a piggy!", TECHIES, R.raw.techies_piggy, newVersion));
		entries.add(new HeroResponse(id++, "Place the sentry ward", LION, R.raw.lion_sentry, newVersion));
		entries.add(new HeroResponse(id++, "Flying courier", SHOPKEEPER, R.raw.shopkeeper_courier, newVersion));
		entries.add(new HeroResponse(id++, "It makes a lot of sense", REPORTER, R.raw.reporter_dota_sense, newVersion));
		entries.add(new HeroResponse(id++, "Techies", ENIGMA, R.raw.enigma_techies, newVersion));
		entries.add(new HeroResponse(id++, "Pinging", RUBICK, R.raw.rubick_pingin, newVersion));
		entries.add(new HeroResponse(id++, "Finally reach level 2", ENIGMA, R.raw.enigma_level_2, newVersion));
		entries.add(new HeroResponse(id++, "Maybe I am, maybe I am not", GYROCOPTER, R.raw.gyro_maybe, newVersion));
		entries.add(new HeroResponse(id++, "Welcome to the secret shop", SHOPKEEPER, R.raw.shopkeeper_dick, newVersion));
		entries.add(new HeroResponse(id++, "Time to fucking duel", LEGION_COMMANDER, R.raw.legion_time_to_duel, newVersion));
		entries.add(new HeroResponse(id++, "Rocks, gimmie a lift", LEGION_COMMANDER, R.raw.legion_rocks_lift, newVersion));
		entries.add(new HeroResponse(id++, "You face Tresdin! Commander of the legion!", LEGION_COMMANDER, R.raw.legion_duel, newVersion));
		entries.add(new HeroResponse(id++, "What does it say?", TECHIES, R.raw.techies_nerf, newVersion));
		entries.add(new HeroResponse(id++, "Commended for teaching", GYROCOPTER, R.raw.gyro_commend_teaching, newVersion));
		entries.add(new HeroResponse(id++, "Careful is my middle name", ENIGMA, R.raw.enigma_careful, newVersion));
		entries.add(new HeroResponse(id++, "I felt like spending mana", LION, R.raw.lion_spending_mana, newVersion));
		entries.add(new HeroResponse(id++, "Sucking that guy", LION, R.raw.lion_enough_mana, newVersion));
		entries.add(new HeroResponse(id++, "Finger online", LION, R.raw.lion_finger_online, newVersion));
		entries.add(new HeroResponse(id++, "Tower! Duel me!", LEGION_COMMANDER, R.raw.legion_duel_ready, newVersion));
		entries.add(new HeroResponse(id++, "You face Tresdin! Commander of ...", LEGION_COMMANDER, R.raw.legion_face_tresdin, newVersion));
		entries.add(new HeroResponse(id++, "Finger of death", RUBICK, R.raw.rubick_finger, newVersion));
		entries.add(new HeroResponse(id++, "Muhaha! Finger!", LION, R.raw.lion_finger, newVersion));
		entries.add(new HeroResponse(id++, "Only 6.86 changes?", ENIGMA, R.raw.enigma_686changes, newVersion));
		entries.add(new HeroResponse(id++, "I got the dragon lance", GYROCOPTER, R.raw.gyro_dragonlance, newVersion));
		entries.add(new HeroResponse(id++, "I don't even have a spell at level 1", INVOKER, R.raw.invoker_spell_level_one, newVersion));


		return new DotaButtonsCategory(entries.size(), toMap(entries));
		
	}

    public static Map<Heroes, List<HeroResponse>> toMap(List<HeroResponse> entries) {

        Map<Heroes, List<HeroResponse>> map = new TreeMap<Heroes, List<HeroResponse>>(new Comparator<Heroes>() {

            @Override
            public int compare(Heroes left, Heroes right) {
                return left.compareTo(right);
            }
        });

        sort(entries);

        if(entries.isEmpty())
            return Collections.EMPTY_MAP;

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
        if(!currentList.isEmpty())
            map.put(currentHero, new Vector<HeroResponse>(currentList));
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
	 * @param startId startId in the database for this category
	 * @return {@ling Map} of {@link List} of {@link HeroResponse} sorted alphabetically
	 */
	public static DotaButtonsCategory loadDotaHeroResponseData(long startId) {
		
		List<HeroResponse> entries = new Vector<HeroResponse>();

        long id=startId;
		entries.add(new HeroResponse(id++, "You can keep your magic", TINKER, R.raw.tink_ability_laser_01));
		entries.add(new HeroResponse(id++, "Magic is an abomination", ANTIMAGE, R.raw.anti_magicuser_01));
		entries.add(new HeroResponse(id++, "Lord of Avernus", ABADDON, R.raw.abad_spawn_02));
		entries.add(new HeroResponse(id++, "First blood", ABADDON, R.raw.abad_firstblood_01));
		entries.add(new HeroResponse(id++, "Very cunning", ABADDON, R.raw.abad_move_19));
		entries.add(new HeroResponse(id++, "Run them down", ABADDON, R.raw.abad_attack_11));
		entries.add(new HeroResponse(id++, "You have cast death upon yourself", ABADDON, R.raw.abad_cast_02));
		entries.add(new HeroResponse(id++, "A shield of power", ABADDON, R.raw.abad_aphoticshield_02));
		entries.add(new HeroResponse(id++, "Laughter", ABADDON, R.raw.abad_kill_16));
		entries.add(new HeroResponse(id++, "Bow to your lord", ABADDON, R.raw.abad_lasthit_06));
		entries.add(new HeroResponse(id++, "Brains and brawns", ALCHEMIST, R.raw.alch_spawn_05));
		entries.add(new HeroResponse(id++, "Didnt throw", ALCHEMIST, R.raw.alch_ability_concoc_25));
		entries.add(new HeroResponse(id++, "What the ...", ALCHEMIST, R.raw.alch_ability_concoc_13));
		entries.add(new HeroResponse(id++, "Throw the damn thing", ALCHEMIST, R.raw.alch_ability_concoc_20));
		entries.add(new HeroResponse(id++, "Talk about overreacting", ALCHEMIST, R.raw.alch_kill_08));
		entries.add(new HeroResponse(id++, "Tell the ogre you're sorry", ALCHEMIST, R.raw.alch_kill_10));
		entries.add(new HeroResponse(id++, "Okey dokey", ALCHEMIST, R.raw.alch_move_05));
		entries.add(new HeroResponse(id++, "Go go go", ALCHEMIST, R.raw.alch_move_22));
		entries.add(new HeroResponse(id++, "Sorry friend, I let you down", ALCHEMIST, R.raw.alch_death_09));
		entries.add(new HeroResponse(id++, "Who's my little buddy", ALCHEMIST, R.raw.alch_rare_01));
		entries.add(new HeroResponse(id++, "Say hello to the nice people", ALCHEMIST, R.raw.alch_rare_04));
		entries.add(new HeroResponse(id++, "Denied", ALCHEMIST, R.raw.alch_deny_16));
		entries.add(new HeroResponse(id++, "Laughter", ANCIENT_APPARITION, R.raw.appa_kill_17));
		entries.add(new HeroResponse(id++, "Magic ends here", ANTIMAGE, R.raw.anti_spawn_04));
		entries.add(new HeroResponse(id++, "Tis in thy head", ANTIMAGE, R.raw.anti_attack_09));
		entries.add(new HeroResponse(id++, "Consider thyself purified", ANTIMAGE, R.raw.anti_kill_02));
		entries.add(new HeroResponse(id++, "What magic is this", ANTIMAGE, R.raw.anti_death_02));
		entries.add(new HeroResponse(id++, "Laughter", ANTIMAGE, R.raw.anti_laugh_05));
		entries.add(new HeroResponse(id++, "Oath to defeat all sorceries", ANTIMAGE, R.raw.anti_respawn_05));
		entries.add(new HeroResponse(id++, "Destroy every magical alliance", ANTIMAGE, R.raw.anti_rare_04));
		entries.add(new HeroResponse(id++, "Nay", ANTIMAGE, R.raw.anti_deny_06));
		entries.add(new HeroResponse(id++, "Are you even trying", ANTIMAGE, R.raw.anti_deny_12));
		entries.add(new HeroResponse(id++, "Victory", ANTIMAGE, R.raw.anti_win_02));
		entries.add(new HeroResponse(id++, "To the enemy", AXE, R.raw.axe_move_08));
		entries.add(new HeroResponse(id++, "Let the carnage begin", AXE, R.raw.axe_spawn_08));
		entries.add(new HeroResponse(id++, "Axe brings the axe", AXE, R.raw.axe_attack_05));
		entries.add(new HeroResponse(id++, "I said good day sir", AXE, R.raw.axe_deny_16));
		entries.add(new HeroResponse(id++, "Axe happened", AXE, R.raw.axe_rival_22));
		entries.add(new HeroResponse(id++, "Axe-actly", AXE, R.raw.axe_rival_23));
		entries.add(new HeroResponse(id++, "Fought badly, died worse", AXE, R.raw.axe_kill_06));
		entries.add(new HeroResponse(id++, "Axe-amination", AXE, R.raw.axe_ally_12));
		entries.add(new HeroResponse(id++, "Time for an re-en-axe-ment", AXE, R.raw.axe_fastres_01));
		entries.add(new HeroResponse(id++, "Bottling rune", AXE, R.raw.axe_bottle_04));
		entries.add(new HeroResponse(id++, "Laughter", BANE, R.raw.bane_battlebegins_01));
		entries.add(new HeroResponse(id++, "Eh-haw", BATRIDER, R.raw.bat_battlebegins_01));
		entries.add(new HeroResponse(id++, "Yeah girl", BATRIDER, R.raw.bat_move_08));
		entries.add(new HeroResponse(id++, "What a ride", BATRIDER, R.raw.bat_move_15));
		entries.add(new HeroResponse(id++, "Yeah yeah yeah", BATRIDER, R.raw.bat_cast_04));
		entries.add(new HeroResponse(id++, "Love that smell", BATRIDER, R.raw.bat_ability_firefly_04));
		entries.add(new HeroResponse(id++, "Woah, sick burn", BATRIDER, R.raw.bat_kill_04));
		entries.add(new HeroResponse(id++, "Backwarmer", BATRIDER, R.raw.bat_rival_01));
		entries.add(new HeroResponse(id++, "Bat to the future", BATRIDER, R.raw.bat_rival_21));
		entries.add(new HeroResponse(id++, "Denied", BATRIDER, R.raw.bat_deny_01));
		entries.add(new HeroResponse(id++, "Just got personal", BOUNTY_HUNTER, R.raw.bount_respawn_12));
		entries.add(new HeroResponse(id++, "Laughter", BOUNTY_HUNTER, R.raw.bount_laugh_02));
		entries.add(new HeroResponse(id++, "Just a bit tipsy", BREWMASTER, R.raw.brew_move_08));
		entries.add(new HeroResponse(id++, "Celebrate with another round", BREWMASTER, R.raw.brew_level_06));
		entries.add(new HeroResponse(id++, "Laughter", BREWMASTER, R.raw.brew_laugh_03));
		entries.add(new HeroResponse(id++, "Facing need mashing", BRISTLEBACK, R.raw.bristle_move_09));
		entries.add(new HeroResponse(id++, "Want some of this?", BRISTLEBACK, R.raw.bristle_attack_18));
		entries.add(new HeroResponse(id++, "Some goo for you", BRISTLEBACK, R.raw.bristle_nasal_goo_06));
		entries.add(new HeroResponse(id++, "Suck it", BRISTLEBACK, R.raw.bristle_laugh_05));
		entries.add(new HeroResponse(id++, "Oopsy daisy", BRISTLEBACK, R.raw.bristle_lasthit_11));
		entries.add(new HeroResponse(id++, "Degree in mechanical domineering", CLOCKWERK, R.raw.ratt_respawn_10));
		entries.add(new HeroResponse(id++, "I am a robot", CLOCKWERK, R.raw.ratt_respawn_18));
		entries.add(new HeroResponse(id++, "Fun and games", CRYSTAL_MAIDEN, R.raw.cm_battlebegins_01));
		entries.add(new HeroResponse(id++, "Hellfire bitch", CRYSTAL_MAIDEN, R.raw.cm_lina_09));
		entries.add(new HeroResponse(id++, "Under that armor", CRYSTAL_MAIDEN, R.raw.cm_ally_06));
		entries.add(new HeroResponse(id++, "Your life lacked a point", DARK_SEER, R.raw.edkseer_kill_01));
		entries.add(new HeroResponse(id++, "Wasn't much", DARK_SEER, R.raw.dkseer_rare_03));
		entries.add(new HeroResponse(id++, "Laughter", DARK_SEER, R.raw.dkseer_laugh_10));
		entries.add(new HeroResponse(id++, "Dazzle!", DAZZLE, R.raw.dazz_ability_sfx_14));
		entries.add(new HeroResponse(id++, "Fissure man", EARTHSHAKER, R.raw.erth_ability_fissure_03));
		entries.add(new HeroResponse(id++, "Gonna pound you", EARTHSHAKER, R.raw.erth_attack_08));
		entries.add(new HeroResponse(id++, "Meeeeooowww", GYROCOPTER, R.raw.gyro_move_29));
		entries.add(new HeroResponse(id++, "Gagagagaga", GYROCOPTER, R.raw.gyro_attack_18));
		entries.add(new HeroResponse(id++, "Laughter", GYROCOPTER, R.raw.gyro_rocket_barrage_06));
		entries.add(new HeroResponse(id++, "Jakiro's copilot", GYROCOPTER, R.raw.gyro_ally_03));
		entries.add(new HeroResponse(id++, "Swallowed a bug", GYROCOPTER, R.raw.gyro_death_11));
		entries.add(new HeroResponse(id++, "Um shit!", GYROCOPTER, R.raw.gyro_death_16));
		entries.add(new HeroResponse(id++, "Get off my lawn", GYROCOPTER, R.raw.gyro_deny_05));
		entries.add(new HeroResponse(id++, "Manical laughter", GYROCOPTER, R.raw.gyro_laugh_11));
		entries.add(new HeroResponse(id++, "This bores me", INVOKER, R.raw.invo_move_23));
		entries.add(new HeroResponse(id++, "You dare fight me", INVOKER, R.raw.invo_attack_06));
		entries.add(new HeroResponse(id++, "Beacon of knowledge", INVOKER, R.raw.invo_level_05));
		entries.add(new HeroResponse(id++, "Laughter", INVOKER, R.raw.invo_level_13));
		entries.add(new HeroResponse(id++, "No match for my powers", INVOKER, R.raw.invo_kill_11));
		entries.add(new HeroResponse(id++, "The universe was not the same without me", INVOKER, R.raw.invo_respawn_05));
		entries.add(new HeroResponse(id++, "Ingenious Archmage, Carl", INVOKER, R.raw.invo_rare_05));
		entries.add(new HeroResponse(id++, "Size of the sword", JUGGERNAUT, R.raw.jugg_rival_01));
		entries.add(new HeroResponse(id++, "Fine line between bravery and stupidity", JUGGERNAUT, R.raw.jug_kill_09));
		entries.add(new HeroResponse(id++, "Jug or not", JUGGERNAUT, R.raw.jug_bottle_03));
		entries.add(new HeroResponse(id++, "I am the juggernaut, bitch", JUGGERNAUT, R.raw.jug_rare_06));
		entries.add(new HeroResponse(id++, "Laughter", KEEPER_OF_THE_LIGHT, R.raw.keep_kill_13));
		entries.add(new HeroResponse(id++, "Epic fail", KEEPER_OF_THE_LIGHT, R.raw.keep_death_10));
		entries.add(new HeroResponse(id++, "Splay your blood across", KUNKKA, R.raw.kunk_attack_04));
		entries.add(new HeroResponse(id++, "Back so soon", KUNKKA, R.raw.kunk_ability_xmark_03));
		entries.add(new HeroResponse(id++, "Fish and crits", KUNKKA, R.raw.kunk_item_10));
		entries.add(new HeroResponse(id++, "Rum in it", KUNKKA, R.raw.kunk_bottle_08));
		entries.add(new HeroResponse(id++, "Laughter", KUNKKA, R.raw.kunk_laugh_04));
		entries.add(new HeroResponse(id++, "That escalated quickly", LEGION_COMMANDER, R.raw.legcom_kill_14));
		entries.add(new HeroResponse(id++, "Son of a ...", LEGION_COMMANDER, R.raw.legcom_duelfailure_06));
		entries.add(new HeroResponse(id++, "Burn baby burn", LINA, R.raw.lina_kill_06));
		entries.add(new HeroResponse(id++, "Pathetic", LUNA, R.raw.luna_kill_11));
		entries.add(new HeroResponse(id++, "I came here for a battle", LUNA, R.raw.luna_kill_10));
		entries.add(new HeroResponse(id++, "Arr har har har", LUNA, R.raw.luna_laugh_06));
		entries.add(new HeroResponse(id++, "Nova? Nova?", LUNA, R.raw.luna_death_07));
		entries.add(new HeroResponse(id++, "Insignificant", LUNA, R.raw.luna_lasthit_07));
		entries.add(new HeroResponse(id++, "Laughter", LUNA, R.raw.luna_laugh_01));
		entries.add(new HeroResponse(id++, "Behold the horn of magnus", MAGNUS, R.raw.magn_spawn_06));
		entries.add(new HeroResponse(id++, "How dare you?", MAGNUS, R.raw.magn_lasthit_10));
		entries.add(new HeroResponse(id++, "Meepo! Meepo! ...", MEEPO, R.raw.meepo_divided_21));
		entries.add(new HeroResponse(id++, "Laughter", MEEPO, R.raw.meepo_levelup_13));
		entries.add(new HeroResponse(id++, "Size ain't everything", MEEPO, R.raw.meepo_kill_08));
		entries.add(new HeroResponse(id++, "Whimper, dogs", MIRANA, R.raw.mir_attack_07));
		entries.add(new HeroResponse(id++, "Nice kitty", MIRANA, R.raw.mir_rare_05));
		entries.add(new HeroResponse(id++, "We say no", MIRANA, R.raw.mir_deny_11));
		entries.add(new HeroResponse(id++, "Rot in hell", NECROPHOS, R.raw.necr_attack_05));
		entries.add(new HeroResponse(id++, "Feast for the flesh flies", NECROPHOS, R.raw.necr_kill_07));
		entries.add(new HeroResponse(id++, "Daywalker, Nightstalker", NIGHT_STALKER, R.raw.nstalk_move_07));
		entries.add(new HeroResponse(id++, "Nyx nyx nyx", NYX_ASSASSIN, R.raw.nyx_kill_17));
		entries.add(new HeroResponse(id++, "Good idea", OGRE_MAGI, R.raw.ogmag_move_14));
		entries.add(new HeroResponse(id++, "Hittin' stuff is fun", OGRE_MAGI, R.raw.ogmag_attack_04));
		entries.add(new HeroResponse(id++, "Eeeeyahhh", OGRE_MAGI, R.raw.ogmag_ability_bloodlust_04));
		entries.add(new HeroResponse(id++, "Skillshot", OGRE_MAGI, R.raw.ogmag_ability_multi_06));
		entries.add(new HeroResponse(id++, "And again and again", OGRE_MAGI, R.raw.ogmag_ability_multi_hit_07));
		entries.add(new HeroResponse(id++, "Double damn it", OGRE_MAGI, R.raw.ogmag_ability_failure_09));
		entries.add(new HeroResponse(id++, "We outsmarted them", OGRE_MAGI, R.raw.ogmag_kill_05));
		entries.add(new HeroResponse(id++, "Selfish", OGRE_MAGI, R.raw.ogmag_lasthit_01));
		entries.add(new HeroResponse(id++, "Dee nied", OGRE_MAGI, R.raw.ogmag_deny_17));
		entries.add(new HeroResponse(id++, "We didnt need...", OGRE_MAGI, R.raw.ogmag_thanks_02));
		entries.add(new HeroResponse(id++, "Laughter", OGRE_MAGI, R.raw.ogmag_laugh_04));
		entries.add(new HeroResponse(id++, "Game of some sort", PUCK, R.raw.puck_spawn_05));
		entries.add(new HeroResponse(id++, "Stay and amuse me", PUCK, R.raw.puck_attack_11));
		entries.add(new HeroResponse(id++, "Silence", PUCK, R.raw.puck_ability_rift_02));
		entries.add(new HeroResponse(id++, "Bye-bye", PUCK, R.raw.puck_ability_phase_03));
		entries.add(new HeroResponse(id++, "They call me the butcher", PUDGE, R.raw.pud_spawn_03));
		entries.add(new HeroResponse(id++, "So much meat, so little time", PUDGE, R.raw.pud_spawn_09));
		entries.add(new HeroResponse(id++, "Get over here", PUDGE, R.raw.pud_ability_hook_04));
		entries.add(new HeroResponse(id++, "I meant to do that", PUDGE, R.raw.pud_ability_hook_miss_01));
		entries.add(new HeroResponse(id++, "Oops, was that me?", PUDGE, R.raw.pud_ability_rot_07));
		entries.add(new HeroResponse(id++, "Fresh meat!", PUDGE, R.raw.pud_ability_devour_16));
		entries.add(new HeroResponse(id++, "Bloody hell", PUDGE, R.raw.pud_death_07));
		entries.add(new HeroResponse(id++, "Look, a spare rib", PUDGE, R.raw.pud_kill_11));
		entries.add(new HeroResponse(id++, "What happened", PUDGE, R.raw.pud_respawn_09));
		entries.add(new HeroResponse(id++, "Denied", PUDGE, R.raw.pud_deny_05));
		entries.add(new HeroResponse(id++, "Thanks meat", PUDGE, R.raw.pud_thanks_03));
		entries.add(new HeroResponse(id++, "Laughter", PUDGE, R.raw.pud_laugh_06));
		entries.add(new HeroResponse(id++, "Incompetence", PUGNA, R.raw.pugna_ability_nward_10));
		entries.add(new HeroResponse(id++, "There will be pain", QUEEN_OF_PAIN, R.raw.pain_spawn_02));
		entries.add(new HeroResponse(id++, "Laughter", QUEEN_OF_PAIN, R.raw.pain_levelup_09));
		entries.add(new HeroResponse(id++, "Did you say stop?", QUEEN_OF_PAIN, R.raw.pain_kill_13));
		entries.add(new HeroResponse(id++, "Come get met", QUEEN_OF_PAIN, R.raw.pain_taunt_01));
		entries.add(new HeroResponse(id++, "No no no", SHADOW_FIEND, R.raw.nev_death_17));
		entries.add(new HeroResponse(id++, "Neia teia an da ka", SHADOW_SHAMAN, R.raw.shad_ability_shackle_08));
		entries.add(new HeroResponse(id++, "Bukaaww! Bukaww", SHADOW_SHAMAN, R.raw.shad_ability_voodoo_06));
		entries.add(new HeroResponse(id++, "Heeyaah", SHADOW_SHAMAN, R.raw.shad_ability_ether_03));
		entries.add(new HeroResponse(id++, "You've thought this through?", SKYWRATH_MAGE, R.raw.drag_move_16));
		entries.add(new HeroResponse(id++, "Laughter", SLARDAR, R.raw.slar_level_07));
		entries.add(new HeroResponse(id++, "Nice one", SLARK, R.raw.slark_move_15));
		entries.add(new HeroResponse(id++, "Here fishy-fishy", SLARK, R.raw.slark_attack_13));
		entries.add(new HeroResponse(id++, "This is going swimmingly", SLARK, R.raw.slark_levelup_04));
		entries.add(new HeroResponse(id++, "Dont mind if I do", SLARK, R.raw.slark_lasthit_03));
		entries.add(new HeroResponse(id++, "Laughter", SLARK, R.raw.slark_laugh_05));
		entries.add(new HeroResponse(id++, "Time for target practice", SNIPER, R.raw.snip_spawn_03));
		entries.add(new HeroResponse(id++, "Shoot em up", SNIPER, R.raw.snip_attack_08));
		entries.add(new HeroResponse(id++, "Bullseye", SNIPER, R.raw.snip_kill_03));
		entries.add(new HeroResponse(id++, "Laughter", SNIPER, R.raw.snip_kill_12));
		entries.add(new HeroResponse(id++, "Sniper reloaded", SNIPER, R.raw.snip_respawn_11));
		entries.add(new HeroResponse(id++, "Handsome devil", STORM_SPIRIT, R.raw.ss_ability_static_01));
		entries.add(new HeroResponse(id++, "Huzzah", STORM_SPIRIT, R.raw.ss_win_05));
		entries.add(new HeroResponse(id++, "Laughter", STORM_SPIRIT, R.raw.ss_laugh_03));
		entries.add(new HeroResponse(id++, "Touche", STORM_SPIRIT, R.raw.ss_ability_lightning_21));
		entries.add(new HeroResponse(id++, "You should not have crossed me", SVEN, R.raw.sven_kill_01));
		entries.add(new HeroResponse(id++, "What did we learn from this", SVEN, R.raw.sven_respawn_02));
		entries.add(new HeroResponse(id++, "Going to be absurd", SVEN, R.raw.sven_item_05));
		entries.add(new HeroResponse(id++, "True friend", SVEN, R.raw.sven_thanks_01));
		entries.add(new HeroResponse(id++, "Laughter", TECHIES, R.raw.tech_move_52));
		entries.add(new HeroResponse(id++, "Whoopsie", TECHIES, R.raw.tech_suicidesquad_11));
		entries.add(new HeroResponse(id++, "Booom", TECHIES, R.raw.tech_focuseddetonate_13));
		entries.add(new HeroResponse(id++, "So beautiful", TECHIES, R.raw.tech_focuseddetonate_11));
		entries.add(new HeroResponse(id++, "Can't believe it worked", TECHIES, R.raw.tech_focuseddetonate_19));
		entries.add(new HeroResponse(id++, "Eureka", TECHIES, R.raw.tech_focuseddetonate_21));
		entries.add(new HeroResponse(id++, "Laughter 2", TECHIES, R.raw.tech_kill_23));
		entries.add(new HeroResponse(id++, "Dont hit that button", TECHIES, R.raw.tech_rare_01));
		entries.add(new HeroResponse(id++, "It's a trap", TEMPLAR_ASSASSIN, R.raw.temp_psionictrap_04));
		entries.add(new HeroResponse(id++, "Spoilers", TEMPLAR_ASSASSIN, R.raw.temp_death_13));
		entries.add(new HeroResponse(id++, "Ha ha ha", TEMPLAR_ASSASSIN, R.raw.temp_laugh_04));
		entries.add(new HeroResponse(id++, "Look out, a tree", TERRORBLADE, R.raw.terr_ally_02));
		entries.add(new HeroResponse(id++, "Women and children and Kunkka first", TIDEHUNTER, R.raw.tide_rival_24));
		entries.add(new HeroResponse(id++, "Kunkkaaa", TIDEHUNTER, R.raw.tide_rival_04));
		entries.add(new HeroResponse(id++, "Trees out there", TIMBERSAW, R.raw.timb_spawn_04));
		entries.add(new HeroResponse(id++, "Are you sure about this", TIMBERSAW, R.raw.timb_move_05));
		entries.add(new HeroResponse(id++, "That one looks angry", TIMBERSAW, R.raw.timb_move_08));
		entries.add(new HeroResponse(id++, "Do I have to?", TIMBERSAW, R.raw.timb_move_17));
		entries.add(new HeroResponse(id++, "Woooh!", TIMBERSAW, R.raw.timb_timberchain_07));
		entries.add(new HeroResponse(id++, "Cut cut cut", TIMBERSAW, R.raw.timb_kill_01));
		entries.add(new HeroResponse(id++, "This is not happening", TIMBERSAW, R.raw.timb_death_18));
		entries.add(new HeroResponse(id++, "This is what I always wanted", TIMBERSAW, R.raw.timb_drop_rare_02));
		entries.add(new HeroResponse(id++, "Clinker", TINKER, R.raw.tink_spawn_06));
		entries.add(new HeroResponse(id++, "Are you thinkin' what I'm thinkin", TINKER, R.raw.tink_move_12));
		entries.add(new HeroResponse(id++, "Pew, pew, pew pew pew!", TINKER, R.raw.tink_ability_laser_03));
		entries.add(new HeroResponse(id++, "Which of us has the degree", TINKER, R.raw.tink_kill_13));
		entries.add(new HeroResponse(id++, "Melting point of Crystal Maiden", TINKER, R.raw.tink_rival_11));
		entries.add(new HeroResponse(id++, "I tink. Therefore I am", TINKER, R.raw.tink_respawn_08));
		entries.add(new HeroResponse(id++, "Time to reboot and kick butt", TINKER, R.raw.tink_travel_06));
		entries.add(new HeroResponse(id++, "Laughter", TINKER, R.raw.tink_deny_09));
		entries.add(new HeroResponse(id++, "Hrauuuugggh", URSA, R.raw.ursa_spawn_11));
		entries.add(new HeroResponse(id++, "Death is my bitch", WRAITH_KING, R.raw.wraith_move_09));
		entries.add(new HeroResponse(id++, "Deal with it", WRAITH_KING, R.raw.wraith_kill_11));
		entries.add(new HeroResponse(id++, "Now I get to shoot stuff", WINDRANGER, R.raw.wind_battlebegins_01));
		entries.add(new HeroResponse(id++, "Shishkebab", WINDRANGER, R.raw.wind_ability_shackleshot_08));
		entries.add(new HeroResponse(id++, "Pronounce you man and tree", WINDRANGER, R.raw.wind_ability_shackleshot_02));
		entries.add(new HeroResponse(id++, "You hit a girl", WINDRANGER, R.raw.wind_death_04));
		entries.add(new HeroResponse(id++, "Why do you hate gingers", WINDRANGER, R.raw.wind_death_05));
		entries.add(new HeroResponse(id++, "Could be worse", WINDRANGER, R.raw.wind_kill_11));
		entries.add(new HeroResponse(id++, "Laughter", WINDRANGER, R.raw.wind_laugh_10));
		entries.add(new HeroResponse(id++, "The doctor is in", WITCH_DOCTOR, R.raw.wdoc_spawn_01));
		entries.add(new HeroResponse(id++, "Look at it go", WITCH_DOCTOR, R.raw.wdoc_ability_cask_06));
		entries.add(new HeroResponse(id++, "Feelin good man", WITCH_DOCTOR, R.raw.wdoc_level_08));
		entries.add(new HeroResponse(id++, "Stick a bone in it, your're done", WITCH_DOCTOR, R.raw.wdoc_kill_11));
		entries.add(new HeroResponse(id++, "He's about to pop", WITCH_DOCTOR, R.raw.wdoc_killspecial_02));
		entries.add(new HeroResponse(id++, "Nononono", WITCH_DOCTOR, R.raw.wdoc_deny_02));
		entries.add(new HeroResponse(id++, "Oyeaaaahh", WITCH_DOCTOR, R.raw.wdoc_laugh_03));
		entries.add(new HeroResponse(id++, "You cant run from heaven", ZEUS, R.raw.zuus_ability_thunder_02));
		entries.add(new HeroResponse(id++, "Laughter", ZEUS, R.raw.zuus_kill_15));
		entries.add(new HeroResponse(id++, "Welcome to Ota", GLADOS, R.raw.glados_ann_glados_prelim_06));
		entries.add(new HeroResponse(id++, "Like chess", GLADOS, R.raw.glados_ann_glados_prelim_18));
		entries.add(new HeroResponse(id++, "Poorly chosen team", GLADOS, R.raw.glados_ann_glados_team_complete_yr_follow_03));
		entries.add(new HeroResponse(id++, "Who will win?", GLADOS, R.raw.glados_ann_glados_battle_begin_follow));
		entries.add(new HeroResponse(id++, "Team of living people", GLADOS, R.raw.glados_killing_spree_ann_glados_allied_teamwipe_04));
		entries.add(new HeroResponse(id++, "Enemy wipe", GLADOS, R.raw.glados_killing_spree_ann_glados_enemy_teamwipe_04));
		entries.add(new HeroResponse(id++, "You solve dota", GLADOS, R.raw.glados_ann_glados_vict_follow_05));
		entries.add(new HeroResponse(id++, "Big deal", GLADOS, R.raw.glados_ann_glados_vict_follow_04));
		entries.add(new HeroResponse(id++, "Dota play-by-play", GLADOS, R.raw.glados_ann_glados_spectat_06));
		entries.add(new HeroResponse(id++, "Doesn't know what they are doing", GLADOS, R.raw.glados_ann_glados_ally_neg_08));
		entries.add(new HeroResponse(id++, "Interesting strategy", GLADOS, R.raw.glados_ann_glados_ally_neg_18));
		entries.add(new HeroResponse(id++, "Elaborate trap", GLADOS, R.raw.glados_ann_glados_event_neg_15));
		entries.add(new HeroResponse(id++, "Nobody cares", GLADOS, R.raw.glados_ann_glados_ally_pos_07));
		entries.add(new HeroResponse(id++, "Good feeling", GLADOS, R.raw.glados_ann_glados_ally_pos_20));
		entries.add(new HeroResponse(id++, "You're winning", GLADOS, R.raw.glados_ann_glados_ally_pos_31));
		entries.add(new HeroResponse(id++, "Respawner traffic", GLADOS, R.raw.glados_ann_glados_followup_respaw_04));
		entries.add(new HeroResponse(id++, "I thought you were dead", GLADOS, R.raw.glados_ann_glados_followup_respaw_13));
		entries.add(new HeroResponse(id++, "I hope you're proud of yourself", GLADOS, R.raw.glados_killing_spree_ann_glados_kill_dominate_01));
		entries.add(new HeroResponse(id++, "What you're doing is wrong", GLADOS, R.raw.glados_killing_spree_ann_glados_kill_holy_03));
		entries.add(new HeroResponse(id++, "Great teamwork", GLADOS, R.raw.glados_killing_spree_ann_glados_kill_ownage_01));
		
		return new DotaButtonsCategory(entries.size(), toMap(entries));

	}

	/**
	 * loads personalities responses (hard-coded)
	 * map is per personality, list per response
	 *
	 * @param startId startId in the database for this category
	 * @return {@ling Map} of {@link List} of {@link HeroResponse} sorted alphabetically
	 */
	public static DotaButtonsCategory loadPersonalitiesData(long startId) {
		List<HeroResponse> entries = new Vector<HeroResponse>();

		long id = startId;

		entries.add(new HeroResponse(id++, "NEEEIN! Fick dein Müdda!", SINGSING, R.raw.sing_fick_dein_muedda));
		entries.add(new HeroResponse(id++, "Surprise! NEEEEIIN!", SINGSING, R.raw.sing_surprise_nein));
		entries.add(new HeroResponse(id++, "Bitches and hoes", SINGSING, R.raw.sing_bitches_and_hoes));

		entries.add(new HeroResponse(id++, "Waaaaah! Waaaaaaah!", BULLDOG, R.raw.bulldog_scream));
		entries.add(new HeroResponse(id++, "Hahaha!", BULLDOG, R.raw.bulldog_laughter1));
		entries.add(new HeroResponse(id++, "Hihihi!", BULLDOG, R.raw.bulldog_laughter2));

		entries.add(new HeroResponse(id++, "Chivalry Laughter", MISC, R.raw.chivalry_laughter));

		return new DotaButtonsCategory(entries.size(), toMap(entries));
	}
}
