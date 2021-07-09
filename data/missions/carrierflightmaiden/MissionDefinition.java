package data.missions.carrierflightmaiden;

import com.fs.starfarer.api.fleet.FleetGoal;
import com.fs.starfarer.api.fleet.FleetMemberType;
import com.fs.starfarer.api.mission.FleetSide;
import com.fs.starfarer.api.mission.MissionDefinitionAPI;
import com.fs.starfarer.api.mission.MissionDefinitionPlugin;

public class MissionDefinition implements MissionDefinitionPlugin {
    public void defineMission(MissionDefinitionAPI api) {
        // Set up the fleets
		api.initFleet(FleetSide.PLAYER, "UAF", FleetGoal.ATTACK, false, 2);
		api.initFleet(FleetSide.ENEMY, "FAU", FleetGoal.ATTACK, true, 5);

		// Set a blurb for each fleet
		api.setFleetTagline(FleetSide.PLAYER, "This is UAF Virtual Field, battle will commence virtually");
		api.setFleetTagline(FleetSide.ENEMY, "FAU is a virtual fleet used for training");
		
		// These show up as items in the bulleted list under 
		// "Tactical Objectives" on the mission detail screen
		api.addBriefingItem("Defeat the enemy forces");
		api.addBriefingItem("Survive, or be wiped.");
		api.addBriefingItem("Scores will be noted down as a test for new admiralty.");
		
		// Set up the player's fleet
		api.addToFleet(FleetSide.PLAYER, "uaf_novaeria_elite", FleetMemberType.SHIP, "UAF Novaeria", true);
		api.addToFleet(FleetSide.PLAYER, "uaf_wing_lynx_ahft", FleetMemberType.SHIP, "UAF Raptor", true);
		//exorias
		api.addToFleet(FleetSide.PLAYER, "uaf_exoria_standard", FleetMemberType.SHIP, "UAF Exoria", false);
		api.addToFleet(FleetSide.PLAYER, "uaf_exoria_bomber", FleetMemberType.SHIP, "UAF Exoria Bomber", false);
		api.addToFleet(FleetSide.PLAYER, "uaf_exoria_superiority", FleetMemberType.SHIP, "UAF Exoria superiority", false);
		api.addToFleet(FleetSide.PLAYER, "uaf_exoria_surgical", FleetMemberType.SHIP, "UAF Exoria Surgical", false);
		api.addToFleet(FleetSide.PLAYER, "uaf_m_exoria_bomber", FleetMemberType.SHIP, "UAF Exoria Bomber", false);
		api.addToFleet(FleetSide.PLAYER, "uaf_m_exoria_standard", FleetMemberType.SHIP, "UAF Exoria Military", false);
		api.addToFleet(FleetSide.PLAYER, "uaf_m_exoria_strike", FleetMemberType.SHIP, "UAF Exoria Strike", false);
		api.addToFleet(FleetSide.PLAYER, "uaf_m_exoria_superiority", FleetMemberType.SHIP, "UAF Exoria superiority", false);

		//minorias
		api.addToFleet(FleetSide.PLAYER, "uaf_minoria_standard", FleetMemberType.SHIP, "UAF Minoria", false);
		api.addToFleet(FleetSide.PLAYER, "uaf_minoria_bomber", FleetMemberType.SHIP, "UAF Minoria Bomber", false);
		api.addToFleet(FleetSide.PLAYER, "uaf_minoria_superiority", FleetMemberType.SHIP, "UAF Minoria Superiority", false);
		api.addToFleet(FleetSide.PLAYER, "uaf_minoria_surgical", FleetMemberType.SHIP, "UAF Minoria Surgical", false);

		api.addToFleet(FleetSide.PLAYER, "uaf_m_minoria_standard", FleetMemberType.SHIP, "UAF Minoria M", false);
		api.addToFleet(FleetSide.PLAYER, "uaf_m_minoria_strike", FleetMemberType.SHIP, "UAF Minoria M Strike", false);
		api.addToFleet(FleetSide.PLAYER, "uaf_m_minoria_bomber", FleetMemberType.SHIP, "UAF Minoria M Bomber", false);
		api.addToFleet(FleetSide.PLAYER, "uaf_m_minoria_superiority", FleetMemberType.SHIP, "UAF Minoria M superiority", false);


		api.addToFleet(FleetSide.PLAYER, "uaf_ai_minoria_standard", FleetMemberType.SHIP, "UAF Minoria AI", false);
		api.addToFleet(FleetSide.PLAYER, "uaf_ai_minoria_strategic", FleetMemberType.SHIP, "UAF Minoria AI Strategic", false);
		api.addToFleet(FleetSide.PLAYER, "uaf_ai_minoria_strike", FleetMemberType.SHIP, "UAF Minoria AI Strike", false);
		api.addToFleet(FleetSide.PLAYER, "uaf_ai_minoria_superiority", FleetMemberType.SHIP, "UAF Minoria AI superiority", false);
		api.addToFleet(FleetSide.PLAYER, "uaf_ai_minoria_surgical", FleetMemberType.SHIP, "UAF Minoria AI Surgical", false);

		//neuxorias
		api.addToFleet(FleetSide.PLAYER, "uaf_ai_neuxoria_standard", FleetMemberType.SHIP, "UAF Neuxoria AI", false);
		api.addToFleet(FleetSide.PLAYER, "uaf_ai_neuxoria_bomber", FleetMemberType.SHIP, "UAF Neuxoria AI Bomber", false);
		api.addToFleet(FleetSide.PLAYER, "uaf_ai_neuxoria_strategic", FleetMemberType.SHIP, "UAF Neuxoria AI Strategic", false);
		api.addToFleet(FleetSide.PLAYER, "uaf_ai_neuxoria_superiority", FleetMemberType.SHIP, "UAF Neuxoria AI Superiority", false);
		api.addToFleet(FleetSide.PLAYER, "uaf_ai_neuxoria_suppressor", FleetMemberType.SHIP, "UAF Neuxoria AI Suppressor", false);
		api.addToFleet(FleetSide.PLAYER, "uaf_ai_neuxoria_surgical", FleetMemberType.SHIP, "UAF Neuxoria AI Surgical", false);

		//zepporias
		api.addToFleet(FleetSide.PLAYER, "uaf_m_zepporia_standard", FleetMemberType.SHIP, "UAF Zepporia M", false);
		api.addToFleet(FleetSide.PLAYER, "uaf_m_zepporia_bomber", FleetMemberType.SHIP, "UAF Zepporia M Bomber", false);
		api.addToFleet(FleetSide.PLAYER, "uaf_m_zepporia_strike", FleetMemberType.SHIP, "UAF Zepporia M Strike", false);
		api.addToFleet(FleetSide.PLAYER, "uaf_m_zepporia_superiority", FleetMemberType.SHIP, "UAF Zepporia M Superiority", false);
		api.addToFleet(FleetSide.PLAYER, "uaf_m_zepporia_multirole", FleetMemberType.SHIP, "UAF Zepporia M Multirole", false);

		//shinorias
		api.addToFleet(FleetSide.PLAYER, "uaf_ai_shinoria_standard", FleetMemberType.SHIP, "UAF Shinoria AI", false);
		api.addToFleet(FleetSide.PLAYER, "uaf_ai_shinoria_superiority", FleetMemberType.SHIP, "UAF Shinoria AI superiority", false);
		api.addToFleet(FleetSide.PLAYER, "uaf_ai_shinoria_strike", FleetMemberType.SHIP, "UAF Shinoria AI Strike", false);
		api.addToFleet(FleetSide.PLAYER, "uaf_ai_shinoria_surgical", FleetMemberType.SHIP, "UAF Shinoria AI Surgical", false);
		api.addToFleet(FleetSide.PLAYER, "uaf_ai_shinoria_suppressor", FleetMemberType.SHIP, "UAF Shinoria AI Suppressor", false);

		api.addToFleet(FleetSide.PLAYER, "uaf_shinoria_standard", FleetMemberType.SHIP, "UAF Shinoria", false);
		api.addToFleet(FleetSide.PLAYER, "uaf_shinoria_superiority", FleetMemberType.SHIP, "UAF Shinoria Superiority", false);
		api.addToFleet(FleetSide.PLAYER, "uaf_shinoria_strike", FleetMemberType.SHIP, "UAF Shinoria Strike", false);
		api.addToFleet(FleetSide.PLAYER, "uaf_shinoria_surgical", FleetMemberType.SHIP, "UAF Shinoria Surgical", false);

		//machis
		api.addToFleet(FleetSide.PLAYER, "uaf_m_machi_apa_transport", FleetMemberType.SHIP, "Machi-I", false);
		api.addToFleet(FleetSide.PLAYER, "uaf_machi_apa_transport", FleetMemberType.SHIP, "Machi-V", false);

		//battlecarrier
		api.addToFleet(FleetSide.PLAYER, "uaf_isenoria_prototype_standard", FleetMemberType.SHIP, "Isenoria", false);
		api.addToFleet(FleetSide.PLAYER, "uaf_isenoria_prototype_bomber", FleetMemberType.SHIP, "Isenoria Bomber", false);
		api.addToFleet(FleetSide.PLAYER, "uaf_isenoria_prototype_surgical", FleetMemberType.SHIP, "Isenoria Surgical", false);
		api.addToFleet(FleetSide.PLAYER, "uaf_isenoria_prototype_assault", FleetMemberType.SHIP, "Isenoria Assault", false);


		api.addToFleet(FleetSide.ENEMY, "uaf_novaeria_elite", FleetMemberType.SHIP, true);
		
		// Set up the map.
		float width = 24000f;
		float height = 18000f;
		api.initMap((float)-width/2f, (float)width/2f, (float)-height/2f, (float)height/2f);
		
		float minX = -width/2;
		float minY = -height/2;
		
		// All the addXXX methods take a pair of coordinates followed by data for
		// whatever object is being added.
		
		// And a few random ones to spice up the playing field.
		// A similar approach can be used to randomize everything
		// else, including fleet composition.
		for (int i = 0; i < 25; i++) {
			float x = (float) Math.random() * width - width/2;
			float y = (float) Math.random() * height - height/2;
			float radius = 400f + (float) Math.random() * 1000f; 
			api.addNebula(x, y, radius);
		}
		
		// Add objectives. These can be captured by each side
		// and provide stat bonuses and extra command points to
		// bring in reinforcements.
		// Reinforcements only matter for large fleets - in this
		// case, assuming a 100 command point battle size,
		// both fleets will be able to deploy fully right away.
		api.addObjective(minX + width * 0.2f + 400 + 3000, minY + height * 0.2f + 400 + 2000, "sensor_array");
		api.addObjective(minX + width * 0.4f + 2000, minY + height * 0.7f, "sensor_array");
		api.addObjective(minX + width * 0.75f - 2000, minY + height * 0.7f, "comm_relay");
		api.addObjective(minX + width * 0.2f + 3000, minY + height * 0.5f, "nav_buoy");
		api.addObjective(minX + width * 0.85f - 3000, minY + height * 0.4f, "nav_buoy");
		
		api.addPlanet(0, 0, 500f, "aurorian", 300f, true);
    }
}
