package de.jakobkarolus.dotabuttons.model;

import de.jakobkarolus.dotabuttons.R;


/**
 * maps hero names to their corresponding portraits
 * 
 * @author Jakob
 *
 */
public enum Heros {
	
	ABADDON(R.drawable.abaddon_icon),
	ALCHEMIST(R.drawable.alchemist_icon),
	ANCIENT_APPARITION(R.drawable.ancient_apparition_icon),
	ANTIMAGE(R.drawable.antimage_icon),
	AXE(R.drawable.axe_icon),
	BANE(R.drawable.bane_icon),
	BATRIDER(R.drawable.batrider_icon),
	BEASTMASTER(R.drawable.beastmaster_icon),
	BLOODSEEKER(R.drawable.bloodseeker_icon),
	BOUNTY_HUNTER(R.drawable.bounty_hunter_icon),
	BREWMASTER(R.drawable.brewmaster_icon),
	BRISTLEBACK(R.drawable.bristleback_icon),
	BROODMOTHER(R.drawable.broodmother_icon),
	CENTAUR_WARRUNNER(R.drawable.centaur_warrunner_icon),
	CHAOS_KNIGHT(R.drawable.chaos_knight_icon),
	CHEN(R.drawable.chen_icon),
	CLINKZ(R.drawable.clinkz_icon),
	CLOCKWERK(R.drawable.clockwerk_icon),
	CRYSTAL_MAIDEN(R.drawable.crystal_maiden_icon),
	DARK_SEER(R.drawable.dark_seer_icon),
	DAZZLE(R.drawable.dazzle_icon),
	DEATH_PROPHET(R.drawable.death_prophet_icon),
	DISRUPTOR(R.drawable.disruptor_icon),
	DOOM_BRINGER(R.drawable.doom_bringer_icon),
	DRAGON_KNIGHT(R.drawable.dragon_knight_icon),
	DROW_RANGER(R.drawable.drow_ranger_icon),
	EARTHSHAKER(R.drawable.earthshaker_icon),
	EARTH_SPIRIT(R.drawable.earth_spirit_icon),
	ELDER_TITAN(R.drawable.elder_titan_icon),
	EMBER_SPIRIT(R.drawable.ember_spirit_icon),
	ENCHANTRESS(R.drawable.enchantress_icon),
	ENIGMA(R.drawable.enigma_icon),
	FACELESS_VOID(R.drawable.faceless_void_icon),
	GYROCOPTER(R.drawable.gyrocopter_icon),
	HUSKAR(R.drawable.huskar_icon),
	INVOKER(R.drawable.invoker_icon),
	IO(R.drawable.io_icon),
	JAKIRO(R.drawable.jakiro_icon),
	JUGGERNAUT(R.drawable.juggernaut_icon),
	KEEPER_OF_THE_LIGHT(R.drawable.keeper_of_the_light_icon),
	KUNKKA(R.drawable.kunkka_icon),
	LEGION_COMMANDER(R.drawable.legion_commander_icon),
	LESHRAC(R.drawable.leshrac_icon),
	LICH(R.drawable.lich_icon),
	LIFESTEALER(R.drawable.lifestealer_icon),
	LINA(R.drawable.lina_icon),
	LION(R.drawable.lion_icon),
	LONE_DRUID(R.drawable.lone_druid_icon),
	LUNA(R.drawable.luna_icon),
	LYCAN(R.drawable.lycan_icon),
	MAGNUS(R.drawable.magnus_icon),
	MEDUSA(R.drawable.medusa_icon),
	MEEPO(R.drawable.meepo_icon),
	MIRANA(R.drawable.mirana_icon),
	MORPHLING(R.drawable.morphling_icon),
	NAGA_SIREN(R.drawable.naga_siren_icon),
	NATURES_PROPHET(R.drawable.natures_prophet_icon),
	NECROPHOS(R.drawable.necrophos_icon),
	NIGHT_STALKER(R.drawable.night_stalker_icon),
	NYX_ASSASSIN(R.drawable.nyx_assassin_icon),
	OGRE_MAGI(R.drawable.ogre_magi_icon),
	OMNIKNIGHT(R.drawable.omniknight_icon),
	OUTWORLD_DEVOURER(R.drawable.outworld_devourer_icon),
	PHANTOM_ASSASSIN(R.drawable.phantom_assassin_icon),
	PHANTOM_LANCER(R.drawable.phantom_lancer_icon),
	PHOENIX(R.drawable.phoenix_icon),
	PUCK(R.drawable.puck_icon),
	PUDGE(R.drawable.pudge_icon),
	PUGNA(R.drawable.pugna_icon),
	QUEEN_OF_PAIN(R.drawable.queen_of_pain_icon),
	RAZOR(R.drawable.razor_icon),
	RIKI(R.drawable.riki_icon),
	RUBICK(R.drawable.rubick_icon),
	SAND_KING(R.drawable.sand_king_icon),
	SHADOW_DEMON(R.drawable.shadow_demon_icon),
	SHADOW_FIEND(R.drawable.shadow_fiend_icon),
	SHADOW_SHAMAN(R.drawable.shadow_shaman_icon),
	SILENCER(R.drawable.silencer_icon),
	SKYWRATH_MAGE(R.drawable.skywrath_mage_icon),
	SLARDAR(R.drawable.slardar_icon),
	SLARK(R.drawable.slark_icon),
	SNIPER(R.drawable.sniper_icon),
	SPECTRE(R.drawable.spectre_icon),
	SPIRIT_BREAKER(R.drawable.spirit_breaker_icon),
	STORM_SPIRIT(R.drawable.storm_spirit_icon),
	SVEN(R.drawable.sven_icon),
	TECHIES(R.drawable.techies_icon),
	TEMPLAR_ASSASSIN(R.drawable.templar_assassin_icon),
	TERRORBLADE(R.drawable.terrorblade_icon),
	TIDEHUNTER(R.drawable.tidehunter_icon),
	TIMBERSAW(R.drawable.timbersaw_icon),
	TINKER(R.drawable.tinker_icon),
	TINY(R.drawable.tiny_icon),
	TREANT_PROTECTOR(R.drawable.treant_protector_icon),
	TROLL_WARLORD(R.drawable.troll_warlord_icon),
	TUSK(R.drawable.tusk_icon),
	UNDYING(R.drawable.undying_icon),
	URSA(R.drawable.ursa_icon),
	VENGEFUL_SPIRIT(R.drawable.vengeful_spirit_icon),
	VENOMANCER(R.drawable.venomancer_icon),
	VIPER(R.drawable.viper_icon),
	VISAGE(R.drawable.visage_icon),
	WARLOCK(R.drawable.warlock_icon),
	WEAVER(R.drawable.weaver_icon),
	WINDRANGER(R.drawable.windranger_icon),
	WITCH_DOCTOR(R.drawable.witch_doctor_icon),
	WRAITH_KING(R.drawable.wraith_king_icon),
	ZEUS(R.drawable.zeus_icon),
	
	REPORTER(R.drawable.reporter_icon),
	SHOPKEEPER(R.drawable.shopkepper_icon),
	CREEP(R.drawable.creep_icon),
	GLADOS(R.drawable.glados_icon);
	
	
	private Heros(int image){
		this.image = image;
	}
	
	private int image;
	
	public int getImageForHero(){
		return image;
	}

}
