package Resources;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.Raster;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.BufferedReader;

/**
 * Created by AlexVR on 7/1/2018.
 */
public class Images {

	// true if you wish to use PrintCropList()
	private boolean processPixelSheet = false;

	public static BufferedImage[] butstart;
	public static BufferedImage title;
	public static BufferedImage title2;
	public static BufferedImage title3;
	public static BufferedImage title4;
	public static BufferedImage[] titleChoose;
	public static BufferedImage titleImage;
	public static BufferedImage Pause;
	public static BufferedImage[] Resume;
	public static BufferedImage[] Quit;
	public static BufferedImage[] BTitle;
	public static BufferedImage[] Options;
	public static ImageIcon icon;

	public static BufferedImage map;
	public static Image Scaledmap;

	public static BufferedImage[] battleBackground;
	public static BufferedImage[] Attack;
	public static BufferedImage[] Defend;
	public static BufferedImage[] Skill;
	public static BufferedImage[] IceSkill;
	public static BufferedImage[] DefenceMode;

	public static BufferedImage[] Enemy;
	public static BufferedImage[] SEnemy;

	public static SpriteSheet smokeHouseSheet;
	public static SpriteSheet iceSkillSheet;
	public static SpriteSheet defenceModeSheet;
	
	public static BufferedImage[] smokeHouse;

	public static BufferedImage CaveMap;
	public static BufferedImage Area;
	public static BufferedImage Loading;
	public static Image ScaledCave;
	public static Image ScaledArea;
	public static BufferedImage tree;

	public Images() {

		butstart = new BufferedImage[3];
		BTitle = new BufferedImage[3];
		titleChoose = new BufferedImage[2];
		Options = new BufferedImage[3];
		Resume = new BufferedImage[2];
		Quit = new BufferedImage[2];

		battleBackground = new BufferedImage[2];

		Attack = new BufferedImage[1];
		Defend = new BufferedImage[1];
		Skill = new BufferedImage[1];

		IceSkill = new BufferedImage[100];
		DefenceMode = new BufferedImage[100];

		Enemy = new BufferedImage[8];
		SEnemy = new BufferedImage[8];

		smokeHouse = new BufferedImage[7];
		try {
			map = ImageIO.read(getClass().getResourceAsStream("/Worlds/map.png"));
			smokeHouseSheet = new SpriteSheet(ImageIO.read(getClass().getResourceAsStream("/Sheets/House.png")));
			
			iceSkillSheet = new SpriteSheet(ImageIO.read(getClass().getResourceAsStream("/Sheets/iceSkill.png")));
			defenceModeSheet=  new SpriteSheet(ImageIO.read(getClass().getResourceAsStream("/Sheets/defenceMode.png")));
			
			CaveMap = ImageIO.read(getClass().getResourceAsStream("/Worlds/CaveMap.png"));
			Area = ImageIO.read(getClass().getResourceAsStream("/Worlds/area.png"));
			tree = ImageIO.read(getClass().getResourceAsStream("/Sheets/Tree.png"));
			title = ImageIO.read(getClass().getResourceAsStream("/Sheets/menuImage.png"));
			title2 = ImageIO.read(getClass().getResourceAsStream("/Sheets/Title.png"));
			title3 = ImageIO.read(getClass().getResourceAsStream("/Sheets/static.jpg"));
			title4 = ImageIO.read(getClass().getResourceAsStream("/Sheets/static1.jpg"));
			Loading = ImageIO.read(getClass().getResourceAsStream("/Sheets/loading.jpg"));
			titleImage = ImageIO.read(getClass().getResourceAsStream("/Sheets/Main3.png"));

			Pause = ImageIO.read(getClass().getResourceAsStream("/Buttons/Pause.png"));
			Resume[0] = ImageIO.read(getClass().getResourceAsStream("/Buttons/ResumeButton3.png"));
			Resume[1] = ImageIO.read(getClass().getResourceAsStream("/Buttons/ResumeButton1.png"));
			BTitle[0] = ImageIO.read(getClass().getResourceAsStream("/Buttons/BTitle.png"));
			BTitle[1] = ImageIO.read(getClass().getResourceAsStream("/Buttons/BTitleP.png"));
			BTitle[2] = ImageIO.read(getClass().getResourceAsStream("/Buttons/BTitleP.png"));
			Options[0] = ImageIO.read(getClass().getResourceAsStream("/Buttons/Options.png"));
			Options[1] = ImageIO.read(getClass().getResourceAsStream("/Buttons/OptionsP.png"));
			Options[2] = ImageIO.read(getClass().getResourceAsStream("/Buttons/OptionsP.png"));
			butstart[0] = ImageIO.read(getClass().getResourceAsStream("/Buttons/Start1.png"));
			butstart[1] = ImageIO.read(getClass().getResourceAsStream("/Buttons/Start2.png"));
			Quit[0] = ImageIO.read(getClass().getResourceAsStream("/Buttons/Quit1.png"));
			Quit[1] = ImageIO.read(getClass().getResourceAsStream("/Buttons/Quit2.png"));
			titleChoose[0] = ImageIO.read(getClass().getResourceAsStream("/Buttons/Title1.png"));
			titleChoose[1] = ImageIO.read(getClass().getResourceAsStream("/Buttons/Title2.png"));

			battleBackground[0] = ImageIO.read(getClass().getResourceAsStream("/Sheets/mountain river.jpg"));
			battleBackground[1] = ImageIO.read(getClass().getResourceAsStream("/Sheets/forest.jpg"));

			Attack[0] = ImageIO.read(getClass().getResourceAsStream("/Buttons/Attack.png"));
			Defend[0] = ImageIO.read(getClass().getResourceAsStream("/Buttons/Defend.png"));
			Skill[0] = ImageIO.read(getClass().getResourceAsStream("/Buttons/Skill.png"));

			smokeHouse[0] = smokeHouseSheet.crop(20, 7, 19, 20);
			smokeHouse[1] = smokeHouseSheet.crop(68, 7, 19, 20);
			smokeHouse[2] = smokeHouseSheet.crop(116, 7, 19, 20);
			smokeHouse[3] = smokeHouseSheet.crop(164, 7, 19, 20);
			smokeHouse[4] = smokeHouseSheet.crop(212, 7, 19, 20);
			smokeHouse[5] = smokeHouseSheet.crop(260, 7, 19, 20);
			smokeHouse[6] = smokeHouseSheet.crop(308, 7, 19, 20);

			Enemy[0] = ImageIO.read(getClass().getResourceAsStream("/Sheets/E1.png"));
			Enemy[1] = ImageIO.read(getClass().getResourceAsStream("/Sheets/E2.png"));
			Enemy[2] = ImageIO.read(getClass().getResourceAsStream("/Sheets/E3.png"));
			Enemy[3] = ImageIO.read(getClass().getResourceAsStream("/Sheets/E4.png"));
			Enemy[4] = ImageIO.read(getClass().getResourceAsStream("/Sheets/E4.png"));
			Enemy[5] = ImageIO.read(getClass().getResourceAsStream("/Sheets/E3.png"));
			Enemy[6] = ImageIO.read(getClass().getResourceAsStream("/Sheets/E2.png"));
			Enemy[7] = ImageIO.read(getClass().getResourceAsStream("/Sheets/E1.png"));
			
			IceSkill[0] = iceSkillSheet.crop( 0, 0, 50, 50);
			IceSkill[1] = iceSkillSheet.crop( 0, 0, 50, 50);
			IceSkill[2] = iceSkillSheet.crop( 52, 0, 50, 50);
			IceSkill[3] = iceSkillSheet.crop( 0, 52 , 50, 50);
			IceSkill[4] = iceSkillSheet.crop( 52, 52 , 50, 50);
			IceSkill[5] = iceSkillSheet.crop( 104, 0, 50, 50);
			IceSkill[6] = iceSkillSheet.crop( 0, 104, 50, 50);
			IceSkill[7] = iceSkillSheet.crop( 52, 104, 50, 50);
			IceSkill[8] = iceSkillSheet.crop( 104, 52, 50, 50);
			IceSkill[9] = iceSkillSheet.crop( 104, 104, 50, 50);
			IceSkill[10] = iceSkillSheet.crop( 156, 0, 50, 50);
			IceSkill[11] = iceSkillSheet.crop( 0, 156, 50, 50);
			IceSkill[12] = iceSkillSheet.crop( 52, 156, 50, 50);
			IceSkill[13] = iceSkillSheet.crop( 156, 52, 50, 50);
			IceSkill[14] = iceSkillSheet.crop( 104, 156, 50, 50);
			IceSkill[15] = iceSkillSheet.crop( 156, 104, 50, 50);
			IceSkill[16] = iceSkillSheet.crop( 208, 0, 50, 50);
			IceSkill[17] = iceSkillSheet.crop( 0, 208, 50, 50);
			IceSkill[18] = iceSkillSheet.crop( 52, 208, 50, 50);
			IceSkill[19] = iceSkillSheet.crop( 208, 52, 50, 50);
			IceSkill[20] = iceSkillSheet.crop( 156, 156, 50, 50);
			IceSkill[21] = iceSkillSheet.crop( 104, 208, 50, 50);
			IceSkill[22] = iceSkillSheet.crop( 208, 104, 50, 50);
			IceSkill[23] = iceSkillSheet.crop( 156, 208, 50, 50);
			IceSkill[24] = iceSkillSheet.crop( 208, 156, 50, 50);
			IceSkill[25] = iceSkillSheet.crop( 260, 0, 50, 50);
			IceSkill[26] = iceSkillSheet.crop( 0, 260, 50, 50);
			IceSkill[27] = iceSkillSheet.crop( 52, 260, 50, 50);
			IceSkill[28] = iceSkillSheet.crop( 260, 52, 50, 50);
			IceSkill[29] = iceSkillSheet.crop( 104, 260, 50, 50);
			IceSkill[30] = iceSkillSheet.crop( 260, 104, 50, 50);
			IceSkill[31] = iceSkillSheet.crop( 208, 208, 50, 50);
			IceSkill[32] = iceSkillSheet.crop( 156, 260, 50, 50);
			IceSkill[33] = iceSkillSheet.crop( 260, 156, 50, 50);
			IceSkill[34] = iceSkillSheet.crop( 312, 0, 50, 50);
			IceSkill[35] = iceSkillSheet.crop( 0, 312, 50, 50);
			IceSkill[36] = iceSkillSheet.crop( 52, 312, 50, 50);
			IceSkill[37] = iceSkillSheet.crop( 312, 52, 50, 50);
			IceSkill[38] = iceSkillSheet.crop( 104, 312, 50, 50);
			IceSkill[39] = iceSkillSheet.crop( 312, 104, 50, 50);
			IceSkill[40] = iceSkillSheet.crop( 208, 260, 50, 50);
			IceSkill[41] = iceSkillSheet.crop( 260, 208, 50, 50);
			IceSkill[42] = iceSkillSheet.crop( 156, 312, 50, 50);
			IceSkill[43] = iceSkillSheet.crop( 312, 156, 50, 50);
			IceSkill[44] = iceSkillSheet.crop( 364, 0, 50, 50);
			IceSkill[45] = iceSkillSheet.crop( 0, 364, 50, 50);
			IceSkill[46] = iceSkillSheet.crop( 52, 364, 50, 50);
			IceSkill[47] = iceSkillSheet.crop( 260, 260, 50, 50);
			IceSkill[48] = iceSkillSheet.crop( 364, 52, 50, 50);
			IceSkill[49] = iceSkillSheet.crop( 208, 312, 50, 50);
			IceSkill[50] = iceSkillSheet.crop( 312, 208, 50, 50);
			IceSkill[51] = iceSkillSheet.crop( 104, 364, 50, 50);
			IceSkill[52] = iceSkillSheet.crop( 364, 104, 50, 50);
			IceSkill[53] = iceSkillSheet.crop( 156, 364, 50, 50);
			IceSkill[54] = iceSkillSheet.crop( 364, 156, 50, 50);
			IceSkill[55] = iceSkillSheet.crop( 260, 312, 50, 50);
			IceSkill[56] = iceSkillSheet.crop( 312, 260, 50, 50);
			IceSkill[57] = iceSkillSheet.crop( 416, 0, 50, 50);
			IceSkill[58] = iceSkillSheet.crop( 0, 416, 50, 50);
			IceSkill[59] = iceSkillSheet.crop( 52, 416, 50, 50);
			IceSkill[60] = iceSkillSheet.crop( 208, 364, 50, 50);
			IceSkill[61] = iceSkillSheet.crop( 364, 208, 50, 50);
			IceSkill[62] = iceSkillSheet.crop( 416, 52, 50, 50);
			IceSkill[63] = iceSkillSheet.crop( 104, 416, 50, 50);
			IceSkill[64] = iceSkillSheet.crop( 416, 104, 50, 50);
			IceSkill[65] = iceSkillSheet.crop( 312, 312, 50, 50);
			IceSkill[66] = iceSkillSheet.crop( 156, 416, 50, 50);
			IceSkill[67] = iceSkillSheet.crop( 416, 156, 50, 50);
			IceSkill[68] = iceSkillSheet.crop( 260, 364, 50, 50);
			IceSkill[69] = iceSkillSheet.crop( 364, 260, 50, 50);
			IceSkill[70] = iceSkillSheet.crop( 208, 416, 50, 50);
			IceSkill[71] = iceSkillSheet.crop( 416, 208, 50, 50);
			IceSkill[72] = iceSkillSheet.crop( 468, 0, 50, 50);
			IceSkill[73] = iceSkillSheet.crop( 468, 52, 50, 50);
			IceSkill[74] = iceSkillSheet.crop( 312, 364, 50, 50);
			IceSkill[75] = iceSkillSheet.crop( 364, 312, 50, 50);
			IceSkill[76] = iceSkillSheet.crop( 468, 104, 50, 50);
			IceSkill[77] = iceSkillSheet.crop( 260, 416, 50, 50);
			IceSkill[78] = iceSkillSheet.crop( 416, 260, 50, 50);
			IceSkill[79] = iceSkillSheet.crop( 468, 156, 50, 50);
			IceSkill[80] = iceSkillSheet.crop( 468, 208, 50, 50);
			IceSkill[81] = iceSkillSheet.crop( 364, 364, 50, 50);
			IceSkill[82] = iceSkillSheet.crop( 312, 416, 50, 50);
			IceSkill[83] = iceSkillSheet.crop( 416, 312, 50, 50);
			IceSkill[84] = iceSkillSheet.crop( 468, 260, 50, 50);
			IceSkill[85] = iceSkillSheet.crop( 364, 416, 50, 50);
			IceSkill[86] = iceSkillSheet.crop( 416, 364, 50, 50);
			IceSkill[87] = iceSkillSheet.crop( 468, 312, 50, 50);
			IceSkill[88] = iceSkillSheet.crop( 0, 0, 50, 50);
			IceSkill[89] = iceSkillSheet.crop( 0, 0, 50, 50);
			IceSkill[90] = iceSkillSheet.crop( 0, 0, 50, 50);
			IceSkill[91] = iceSkillSheet.crop( 0, 0, 50, 50);
			IceSkill[92] = iceSkillSheet.crop( 0, 0, 50, 50);
			IceSkill[93] = iceSkillSheet.crop( 0, 0, 50, 50);
			IceSkill[94] = iceSkillSheet.crop( 0, 0, 50, 50);
			IceSkill[95] = iceSkillSheet.crop( 0, 0, 50, 50);
			IceSkill[96] = iceSkillSheet.crop( 0, 0, 50, 50);
			IceSkill[97] = iceSkillSheet.crop( 0, 0, 50, 50);
			IceSkill[98] = iceSkillSheet.crop( 0, 0, 50, 50);
			IceSkill[99] = iceSkillSheet.crop( 0, 0, 50, 50);
			
			
			DefenceMode[0] = defenceModeSheet.crop( 0, 0, 50, 50);
			DefenceMode[1] = defenceModeSheet.crop( 0, 0, 50, 50);
			DefenceMode[2] = defenceModeSheet.crop( 0, 0, 50, 50);
			DefenceMode[3] = defenceModeSheet.crop( 0, 0, 50, 50);
			DefenceMode[4] = defenceModeSheet.crop( 0, 0, 50, 50);
			DefenceMode[5] = defenceModeSheet.crop( 0, 0, 50, 50);
			DefenceMode[6] = defenceModeSheet.crop( 0, 0, 50, 50);
			DefenceMode[7] = defenceModeSheet.crop( 0, 0, 50, 50);
			DefenceMode[8] = defenceModeSheet.crop( 0, 0, 50, 50);
			DefenceMode[9] = defenceModeSheet.crop( 52, 0, 50, 50);
			DefenceMode[10] = defenceModeSheet.crop( 0, 52 , 50, 50);
			DefenceMode[11] = defenceModeSheet.crop( 52, 52 , 50, 50);
			DefenceMode[12] = defenceModeSheet.crop( 104, 0, 50, 50);
			DefenceMode[13] = defenceModeSheet.crop( 0, 104, 50, 50);
			DefenceMode[14] = defenceModeSheet.crop( 52, 104, 50, 50);
			DefenceMode[15] = defenceModeSheet.crop( 104, 52, 50, 50);
			DefenceMode[16] = defenceModeSheet.crop( 104, 104, 50, 50);
			DefenceMode[17] = defenceModeSheet.crop( 156, 0, 50, 50);
			DefenceMode[18] = defenceModeSheet.crop( 0, 156, 50, 50);
			DefenceMode[19] = defenceModeSheet.crop( 52, 156, 50, 50);
			DefenceMode[20] = defenceModeSheet.crop( 156, 52, 50, 50);
			DefenceMode[21] = defenceModeSheet.crop( 104, 156, 50, 50);
			DefenceMode[22] = defenceModeSheet.crop( 156, 104, 50, 50);
			DefenceMode[23] = defenceModeSheet.crop( 208, 0, 50, 50);
			DefenceMode[24] = defenceModeSheet.crop( 0, 208, 50, 50);
			DefenceMode[25] = defenceModeSheet.crop( 52, 208, 50, 50);
			DefenceMode[26] = defenceModeSheet.crop( 208, 52, 50, 50);
			DefenceMode[27] = defenceModeSheet.crop( 156, 156, 50, 50);
			DefenceMode[28] = defenceModeSheet.crop( 104, 208, 50, 50);
			DefenceMode[29] = defenceModeSheet.crop( 208, 104, 50, 50);
			DefenceMode[30] = defenceModeSheet.crop( 156, 208, 50, 50);
			DefenceMode[31] = defenceModeSheet.crop( 208, 156, 50, 50);
			DefenceMode[32] = defenceModeSheet.crop( 260, 0, 50, 50);
			DefenceMode[33] = defenceModeSheet.crop( 0, 260, 50, 50);
			DefenceMode[34] = defenceModeSheet.crop( 52, 260, 50, 50);
			DefenceMode[35] = defenceModeSheet.crop( 260, 52, 50, 50);
			DefenceMode[36] = defenceModeSheet.crop( 104, 260, 50, 50);
			DefenceMode[37] = defenceModeSheet.crop( 260, 104, 50, 50);
			DefenceMode[38] = defenceModeSheet.crop( 208, 208, 50, 50);
			DefenceMode[39] = defenceModeSheet.crop( 156, 260, 50, 50);
			DefenceMode[40] = defenceModeSheet.crop( 260, 156, 50, 50);
			DefenceMode[41] = defenceModeSheet.crop( 312, 0, 50, 50);
			DefenceMode[42] = defenceModeSheet.crop( 0, 312, 50, 50);
			DefenceMode[43] = defenceModeSheet.crop( 52, 312, 50, 50);
			DefenceMode[44] = defenceModeSheet.crop( 312, 52, 50, 50);
			DefenceMode[45] = defenceModeSheet.crop( 104, 312, 50, 50);
			DefenceMode[46] = defenceModeSheet.crop( 312, 104, 50, 50);
			DefenceMode[47] = defenceModeSheet.crop( 208, 260, 50, 50);
			DefenceMode[48] = defenceModeSheet.crop( 260, 208, 50, 50);
			DefenceMode[49] = defenceModeSheet.crop( 156, 312, 50, 50);
			DefenceMode[50] = defenceModeSheet.crop( 312, 156, 50, 50);
			DefenceMode[51] = defenceModeSheet.crop( 364, 0, 50, 50);
			DefenceMode[52] = defenceModeSheet.crop( 0, 364, 50, 50);
			DefenceMode[53] = defenceModeSheet.crop( 52, 364, 50, 50);
			DefenceMode[54] = defenceModeSheet.crop( 260, 260, 50, 50);
			DefenceMode[55] = defenceModeSheet.crop( 364, 52, 50, 50);
			DefenceMode[56] = defenceModeSheet.crop( 208, 312, 50, 50);
			DefenceMode[57] = defenceModeSheet.crop( 312, 208, 50, 50);
			DefenceMode[58] = defenceModeSheet.crop( 104, 364, 50, 50);
			DefenceMode[59] = defenceModeSheet.crop( 364, 104, 50, 50);
			DefenceMode[60] = defenceModeSheet.crop( 156, 364, 50, 50);
			DefenceMode[61] = defenceModeSheet.crop( 364, 156, 50, 50);
			DefenceMode[62] = defenceModeSheet.crop( 260, 312, 50, 50);
			DefenceMode[63] = defenceModeSheet.crop( 312, 260, 50, 50);
			DefenceMode[64] = defenceModeSheet.crop( 416, 0, 50, 50);
			DefenceMode[65] = defenceModeSheet.crop( 0, 416, 50, 50);
			DefenceMode[66] = defenceModeSheet.crop( 52, 416, 50, 50);
			DefenceMode[67] = defenceModeSheet.crop( 208, 364, 50, 50);
			DefenceMode[68] = defenceModeSheet.crop( 364, 208, 50, 50);
			DefenceMode[69] = defenceModeSheet.crop( 416, 52, 50, 50);
			DefenceMode[70] = defenceModeSheet.crop( 104, 416, 50, 50);
			DefenceMode[71] = defenceModeSheet.crop( 416, 104, 50, 50);
			DefenceMode[72] = defenceModeSheet.crop( 312, 312, 50, 50);
			DefenceMode[73] = defenceModeSheet.crop( 156, 416, 50, 50);
			DefenceMode[74] = defenceModeSheet.crop( 416, 156, 50, 50);
			DefenceMode[75] = defenceModeSheet.crop( 260, 364, 50, 50);
			DefenceMode[76] = defenceModeSheet.crop( 364, 260, 50, 50);
			DefenceMode[77] = defenceModeSheet.crop( 208, 416, 50, 50);
			DefenceMode[78] = defenceModeSheet.crop( 416, 208, 50, 50);
			DefenceMode[79] = defenceModeSheet.crop( 312, 364, 50, 50);
			DefenceMode[80] = defenceModeSheet.crop( 364, 312, 50, 50);
			DefenceMode[81] = defenceModeSheet.crop( 260, 416, 50, 50);
			DefenceMode[82] = defenceModeSheet.crop( 416, 260, 50, 50);
			DefenceMode[83] = defenceModeSheet.crop( 0, 0, 50, 50);
			DefenceMode[84] = defenceModeSheet.crop( 364, 364, 50, 50);
			DefenceMode[85] = defenceModeSheet.crop( 0, 0, 50, 50);
			DefenceMode[86] = defenceModeSheet.crop( 0, 0, 50, 50);
			DefenceMode[87] = defenceModeSheet.crop( 0, 0, 50, 50);
			DefenceMode[88] = defenceModeSheet.crop( 0, 0, 50, 50);
			DefenceMode[89] = defenceModeSheet.crop( 0, 0, 50, 50);
			DefenceMode[90] = defenceModeSheet.crop( 0, 0, 50, 50);
			DefenceMode[91] = defenceModeSheet.crop( 0, 0, 50, 50);
			DefenceMode[92] = defenceModeSheet.crop( 0, 0, 50, 50);
			DefenceMode[93] = defenceModeSheet.crop( 0, 0, 50, 50);
			DefenceMode[94] = defenceModeSheet.crop( 0, 0, 50, 50);
			DefenceMode[95] = defenceModeSheet.crop( 0, 0, 50, 50);
			DefenceMode[96] = defenceModeSheet.crop( 0, 0, 50, 50);
			DefenceMode[97] = defenceModeSheet.crop( 0, 0, 50, 50);
			DefenceMode[98] = defenceModeSheet.crop( 0, 0, 50, 50);
			DefenceMode[99] = defenceModeSheet.crop( 0, 0, 50, 50);
			
			

			icon = new ImageIcon(ImageIO.read(getClass().getResourceAsStream("/Sheets/icon.png")));

			if (processPixelSheet) {
				PrintCropList("DefenceMode", "defenceModeSheet", "/EffectCrops/defenceModeCropCoords.txt", 50, 50);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		Scaledmap = Images.map.getScaledInstance(8000, 6000, Image.SCALE_SMOOTH);
		ScaledCave = Images.CaveMap.getScaledInstance(3680, 4000, Image.SCALE_SMOOTH); // 368x400 pixel image
		ScaledArea = Images.Area.getScaledInstance(8000, 6000, Image.SCALE_SMOOTH);

	}

	/*
	 * Given a File containing a list of crop coordinate systems, this will output a
	 * File with all the crop coordinates in an orderly fashion like to later
	 * Copy/Paste.
	 * 
	 * @param String skill is the name of the array that will hold the frames of a
	 * skill
	 * 
	 * @param String sheet is the sheet to which the frames are located
	 * 
	 * Compatible only with
	 * https://untiedgames.itch.io/wills-magic-pixel-particle-effects
	 */
	public void PrintCropList(String skill, String sheet, String path, int width, int height) throws IOException {

		Scanner in = new Scanner(getClass().getResourceAsStream(path));
		String line;

		String xPos;
		String yPos;

		int indexCounter = 0;

		while (in.hasNextLine()) {							//			     11111111112222222   <---LINE INDEX REFERENCE
															//     012345678901234567890123456	 <---
			line = in.nextLine();							// EX: frame0005 = 104 156 100 100

															////////FOR X////////
			xPos = line.substring(12, 15);
			if (xPos.startsWith("0")) { 					// EX: 0 156 100 100
				xPos = "0";
			} else if (xPos.endsWith(" ")) { 				// EX: 52 0 50 50
				xPos = xPos.substring(0, 2);
			}
															////////FOR Y////////
													 
			if (xPos.length() == 1) {						// EX: 0 0 50 50		EX: 0 208 50 50
				if (line.charAt(14) == '0') {
					yPos = "0";
				} else {
					yPos = line.substring(14, 17);	
				}										
			}
			else if (xPos.length() == 2) {					// EX: 52 0 50 50		EX: 52 104 100 100
				yPos = line.substring(15, 18);				// Then y = 0 5			Then y = 104
				if (yPos.startsWith("0")) {
					yPos = "0";								// Now y = 0
				}
			} else {     // xPos.length() == 3			 	EX: 104 0 100 100    EX: 156 52 50 50     EX: 104 156 100 100
					
					if (line.charAt(16) == '0'){			// Then y = 0			Then y = 52 		 Then y = 156					
						yPos = line.charAt(16) + "";
					}
					else if (line.charAt(18) == ' ') {
						yPos = line.substring(16, 18);
					}
					else {
						yPos = line.substring(16, 19);
					}			
			}

			System.out.println(skill + "[" + indexCounter + "]" + " = " + sheet + ".crop( " + xPos + ", " + yPos + ", " + width + ", " + height + ");");
			indexCounter++;
		}

	}

	public static BufferedImage tint(BufferedImage src, float r, float g, float b) {

		// Copy image ( who made that so complicated :< )
		BufferedImage newImage = new BufferedImage(src.getWidth(), src.getHeight(), BufferedImage.TRANSLUCENT);
		Graphics2D graphics = newImage.createGraphics();
		graphics.drawImage(src, 0, 0, null);
		graphics.dispose();

		// Color image
		for (int i = 0; i < newImage.getWidth(); i++) {
			for (int j = 0; j < newImage.getHeight(); j++) {
				int ax = newImage.getColorModel().getAlpha(newImage.getRaster().getDataElements(i, j, null));
				int rx = newImage.getColorModel().getRed(newImage.getRaster().getDataElements(i, j, null));
				int gx = newImage.getColorModel().getGreen(newImage.getRaster().getDataElements(i, j, null));
				int bx = newImage.getColorModel().getBlue(newImage.getRaster().getDataElements(i, j, null));
				rx *= r;
				gx *= g;
				bx *= b;
				newImage.setRGB(i, j, (ax << 24) | (rx << 16) | (gx << 8) | (bx << 0));
			}
		}
		return newImage;
	}

	public static BufferedImage loadImage(String path) {
		try {
			return ImageIO.read(Images.class.getResourceAsStream(path));
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(1);
		}
		return null;
	}

}
