package data.missions.firingrange;
import com.fs.starfarer.api.Global;
import com.fs.starfarer.api.fleet.FleetGoal;
import com.fs.starfarer.api.fleet.FleetMemberType;
import com.fs.starfarer.api.mission.FleetSide;
import com.fs.starfarer.api.mission.MissionDefinitionAPI;
import com.fs.starfarer.api.mission.MissionDefinitionPlugin;

public class MissionDefinition implements MissionDefinitionPlugin {
    public void defineMission(MissionDefinitionAPI api) {
        // Set up the fleets
		api.initFleet(FleetSide.PLAYER, "UAF", FleetGoal.ATTACK, false, 10);
		api.initFleet(FleetSide.ENEMY, "FAU", FleetGoal.ATTACK, true, 5);

		// Set a blurb for each fleet
		api.setFleetTagline(FleetSide.PLAYER, "UAF Military");
		
		// These show up as items in the bulleted list under 
		// "Tactical Objectives" on the mission detail screen
		api.addBriefingItem("Defeat the enemy forces");
		api.addBriefingItem("Survive, or be wiped.");
		api.addBriefingItem("Don't let the new Solvernia be wiped");
		
		// Solvy
		api.addToFleet(FleetSide.PLAYER, "uaf_slvv_core_elite", FleetMemberType.SHIP, "UAF Solvernia", true);
		
		//Purcellyra
		api.addToFleet(FleetSide.PLAYER, "uaf_purcellyra_standard", FleetMemberType.SHIP, "Shield-I", false);
		api.addToFleet(FleetSide.PLAYER, "uaf_scinaut_suv_standard", FleetMemberType.SHIP, "Scinaut-I", false);

		//Rillaru
		api.addToFleet(FleetSide.PLAYER, "uaf_rillaru_standard", FleetMemberType.SHIP, "Sword-I", false);
		api.addToFleet(FleetSide.PLAYER, "uaf_rillaru_defense", FleetMemberType.SHIP, "Sword-II", false);
		api.addToFleet(FleetSide.PLAYER, "uaf_rillaru_assault", FleetMemberType.SHIP, "Sword-III", false);
		api.addToFleet(FleetSide.PLAYER, "uaf_rillaru_suppression", FleetMemberType.SHIP, "Sword-IV", false);
		api.addToFleet(FleetSide.PLAYER, "uaf_ai_rillaru_assault", FleetMemberType.SHIP, "Beam-I", false);
		api.addToFleet(FleetSide.PLAYER, "uaf_ai_rillaru_standard", FleetMemberType.SHIP, "Beam-II", false);
		api.addToFleet(FleetSide.PLAYER, "uaf_ai_rillaru_suppressor", FleetMemberType.SHIP, "Beam-III", false);

		//Reisen
		api.addToFleet(FleetSide.PLAYER, "uaf_m_reisen_assault", FleetMemberType.SHIP, "Brocade I", false);
		api.addToFleet(FleetSide.PLAYER, "uaf_m_reisen_standard", FleetMemberType.SHIP, "Brocade II", false);
		api.addToFleet(FleetSide.PLAYER, "uaf_m_reisen_support", FleetMemberType.SHIP, "Brocade III", false);
		api.addToFleet(FleetSide.PLAYER, "uaf_m_reisen_suppressor", FleetMemberType.SHIP, "Brocade IV", false);
		api.addToFleet(FleetSide.PLAYER, "uaf_reisen_standard", FleetMemberType.SHIP, "Dreams I", false);
		api.addToFleet(FleetSide.PLAYER, "uaf_reisen_assault", FleetMemberType.SHIP, "Dreams II", false);
		api.addToFleet(FleetSide.PLAYER, "uaf_reisen_suppression", FleetMemberType.SHIP, "Dreams III", false);

		//Nakiha
		api.addToFleet(FleetSide.PLAYER, "uaf_m_nakiha_multirole", FleetMemberType.SHIP, "Greyhound Alpha I", false);
		api.addToFleet(FleetSide.PLAYER, "uaf_m_nakiha_raider", FleetMemberType.SHIP, "Greyhound Alpha II", false);
		api.addToFleet(FleetSide.PLAYER, "uaf_m_nakiha_standard", FleetMemberType.SHIP, "Greyhound Alpha III", false);
		api.addToFleet(FleetSide.PLAYER, "uaf_m_nakiha_suppressor", FleetMemberType.SHIP, "Greyhound Alpha IV", false);
		api.addToFleet(FleetSide.PLAYER, "uaf_ai_nakiha_assault", FleetMemberType.SHIP, "Greyhound Beta I", false);
		api.addToFleet(FleetSide.PLAYER, "uaf_ai_nakiha_escort", FleetMemberType.SHIP, "Greyhound Beta II", false);
		api.addToFleet(FleetSide.PLAYER, "uaf_ai_nakiha_standard", FleetMemberType.SHIP, "Greyhound Beta III", false);
		api.addToFleet(FleetSide.PLAYER, "uaf_ai_nakiha_support", FleetMemberType.SHIP, "Greyhound Beta IV", false);
		api.addToFleet(FleetSide.PLAYER, "uaf_ai_nakiha_suppressor", FleetMemberType.SHIP, "Greyhound Beta V", false);
		api.addToFleet(FleetSide.PLAYER, "uaf_nakiha_standard", FleetMemberType.SHIP, "Greyhound Gamma I", false);
		api.addToFleet(FleetSide.PLAYER, "uaf_nakiha_multirole", FleetMemberType.SHIP, "Greyhound Gamma I", false);
		api.addToFleet(FleetSide.PLAYER, "uaf_nakiha_assault", FleetMemberType.SHIP, "Greyhound Gamma I", false);
		api.addToFleet(FleetSide.PLAYER, "uaf_nakiha_suppressor", FleetMemberType.SHIP, "Greyhound Gamma I", false);

		//Perwira
		api.addToFleet(FleetSide.PLAYER, "uaf_m_perwira_standard", FleetMemberType.SHIP, "Boxer-I", false);
		
		//Rama
		api.addToFleet(FleetSide.PLAYER, "uaf_rama_corvette_standard", FleetMemberType.SHIP, "Bee-I", false);
		api.addToFleet(FleetSide.PLAYER, "uaf_rama_corvette_raider", FleetMemberType.SHIP, "Bee-II", false);
		api.addToFleet(FleetSide.PLAYER, "uaf_rama_corvette_suppressor", FleetMemberType.SHIP, "Bee-III", false);
		api.addToFleet(FleetSide.PLAYER, "uaf_m_rama_corvette_standard", FleetMemberType.SHIP, "2Bee-I", false);
		api.addToFleet(FleetSide.PLAYER, "uaf_m_rama_corvette_multirole", FleetMemberType.SHIP, "2Bee-II", false);
		api.addToFleet(FleetSide.PLAYER, "uaf_m_rama_corvette_raider", FleetMemberType.SHIP, "2Bee-III", false);
		api.addToFleet(FleetSide.PLAYER, "uaf_m_rama_corvette_suppressor", FleetMemberType.SHIP, "2Bee-IV", false);
		api.addToFleet(FleetSide.PLAYER, "uaf_ai_rama_corvette_assault", FleetMemberType.SHIP, "/2Bee-I", false);
		api.addToFleet(FleetSide.PLAYER, "uaf_ai_rama_corvette_defense", FleetMemberType.SHIP, "/2Bee-II", false);
		api.addToFleet(FleetSide.PLAYER, "uaf_ai_rama_corvette_standard", FleetMemberType.SHIP, "/2Bee-III", false);
		api.addToFleet(FleetSide.PLAYER, "uaf_ai_rama_corvette_suppressor", FleetMemberType.SHIP, "/2Bee-IV", false);

		//Sentry
		api.addToFleet(FleetSide.PLAYER, "uaf_m_sentry_prototype", FleetMemberType.SHIP, "Arty-I", false);
		// api.addToFleet(FleetSide.PLAYER, "uaf_sentry_standard", FleetMemberType.SHIP, "Arty-II", false);

		//Inazuma
		api.addToFleet(FleetSide.PLAYER, "uaf_m_inazuma_assault", FleetMemberType.SHIP, "Archer-I", false);
		api.addToFleet(FleetSide.PLAYER, "uaf_m_inazuma_standard", FleetMemberType.SHIP, "Archer-II", false);
		api.addToFleet(FleetSide.PLAYER, "uaf_m_inazuma_support", FleetMemberType.SHIP, "Archer-III", false);
		api.addToFleet(FleetSide.PLAYER, "uaf_m_inazuma_suppressor", FleetMemberType.SHIP, "Archer-IV", false);
		api.addToFleet(FleetSide.PLAYER, "uaf_ai_inazuma_standard", FleetMemberType.SHIP, "Bow-I", false);
		api.addToFleet(FleetSide.PLAYER, "uaf_ai_inazuma_support", FleetMemberType.SHIP, "Bow-II", false);
		api.addToFleet(FleetSide.PLAYER, "uaf_ai_inazuma_suppressor", FleetMemberType.SHIP, "Bow-III", false);
		api.addToFleet(FleetSide.PLAYER, "uaf_inazuma_standard", FleetMemberType.SHIP, "String-I", false);
		api.addToFleet(FleetSide.PLAYER, "uaf_inazuma_assault", FleetMemberType.SHIP, "String-II", false);
		api.addToFleet(FleetSide.PLAYER, "uaf_inazuma_defense", FleetMemberType.SHIP, "String-III", false);
		api.addToFleet(FleetSide.PLAYER, "uaf_inazuma_suppressor", FleetMemberType.SHIP, "String-IV", false);

		//Lovela
		api.addToFleet(FleetSide.PLAYER, "uaf_ai_lovela_assault", FleetMemberType.SHIP, "Heavy AI Escort I", false);
		api.addToFleet(FleetSide.PLAYER, "uaf_ai_lovela_standard", FleetMemberType.SHIP, "Heavy AI Escort II", false);
		api.addToFleet(FleetSide.PLAYER, "uaf_ai_lovela_support", FleetMemberType.SHIP, "Heavy AI Escort III", false);
		api.addToFleet(FleetSide.PLAYER, "uaf_ai_lovela_suppressor", FleetMemberType.SHIP, "Heavy AI Escort IV", false);
		api.addToFleet(FleetSide.PLAYER, "uaf_lovela_standard", FleetMemberType.SHIP, "Heavy Escort I", false);
		api.addToFleet(FleetSide.PLAYER, "uaf_lovela_assault", FleetMemberType.SHIP, "Heavy Escort II", false);
		api.addToFleet(FleetSide.PLAYER, "uaf_lovela_strike", FleetMemberType.SHIP, "Heavy Escort III", false);
		api.addToFleet(FleetSide.PLAYER, "uaf_lovela_suppression", FleetMemberType.SHIP, "Heavy Escort IV", false);
		api.addToFleet(FleetSide.PLAYER, "uaf_m_lovela_multirole", FleetMemberType.SHIP, "Heavy M Escort I", false);
		api.addToFleet(FleetSide.PLAYER, "uaf_m_lovela_assault", FleetMemberType.SHIP, "Heavy M Escort I", false);
		api.addToFleet(FleetSide.PLAYER, "uaf_m_lovela_standard", FleetMemberType.SHIP, "Heavy M Escort I", false);
		api.addToFleet(FleetSide.PLAYER, "uaf_m_lovela_suppressor", FleetMemberType.SHIP, "Heavy M Escort I", false);
		
		//logistics
		api.addToFleet(FleetSide.PLAYER, "uaf_tsutsumu_l_standard", FleetMemberType.SHIP, "Panamax", false);
		api.addToFleet(FleetSide.PLAYER, "uaf_sekai_s_standard", FleetMemberType.SHIP, "Golden Nori", false);
		api.addToFleet(FleetSide.PLAYER, "uaf_wo_m_standard", FleetMemberType.SHIP, "Golden Nori", false);
		api.addToFleet(FleetSide.PLAYER, "uaf_osela_suv_standard", FleetMemberType.SHIP, "Explorator I", false);
		api.addToFleet(FleetSide.PLAYER, "uaf_eyeseau_defense", FleetMemberType.SHIP, "Explorator II", false);
		api.addToFleet(FleetSide.PLAYER, "uaf_eyeseau_offensive", FleetMemberType.SHIP, "Explorator III", false);
		api.addToFleet(FleetSide.PLAYER, "uaf_eyeseau_standard", FleetMemberType.SHIP, "Explorator IV", false);
		api.addToFleet(FleetSide.PLAYER, "uaf_m_nebula_bravo_runner", FleetMemberType.SHIP, "Invincible", false);

		api.defeatOnShipLoss("UAF Solvernia");
	
		// Solvy
		api.addToFleet(FleetSide.ENEMY, "uaf_slvv_core_elite", FleetMemberType.SHIP, "UAF Solvirnea", true);

		// Set up the map.
		float width = 24000f;
		float height = 18000f;
		api.initMap((float)-width/2f, (float)width/2f, (float)-height/2f, (float)height/2f);
		
		float minX = -width/2;
		float minY = -height/2;
		
		for (int i = 0; i < 15; i++) {
			float x = (float) Math.random() * width - width/2;
			float y = (float) Math.random() * height - height/2;
			float radius = 100f + (float) Math.random() * 900f; 
			api.addNebula(x, y, radius);
		}
		
		api.addNebula(minX + width * 0.8f - 1000, minY + height * 0.4f, 2000);
		api.addNebula(minX + width * 0.8f - 1000, minY + height * 0.5f, 2000);
		api.addNebula(minX + width * 0.8f - 1000, minY + height * 0.6f, 2000);
		
		api.addObjective(minX + width * 0.8f - 1000, minY + height * 0.4f, "nav_buoy");
		api.addObjective(minX + width * 0.8f - 1000, minY + height * 0.6f, "nav_buoy");
		api.addObjective(minX + width * 0.3f + 1000, minY + height * 0.3f, "comm_relay");
		api.addObjective(minX + width * 0.3f + 1000, minY + height * 0.7f, "comm_relay");
		api.addObjective(minX + width * 0.5f, minY + height * 0.5f, "sensor_array");
		api.addObjective(minX + width * 0.2f + 1000, minY + height * 0.5f, "sensor_array");
		
		api.addAsteroidField(minX + width * 0.3f, minY, 90, 3000f,
								20f, 70f, 50);
		
		api.addPlanet(0, 0, 200f, "irradiated", 350f, true);
		
    }
}
