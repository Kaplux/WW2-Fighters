package fr.mildlyusefulsoftware.ww2fighters.activity;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.util.Log;
import fr.mildlyusefulsoftware.imageviewer.service.DatabaseHelper;
import fr.mildlyusefulsoftware.imageviewer.service.Picture;

public class ViewPictureActivity extends fr.mildlyusefulsoftware.imageviewer.activity.ViewPictureActivity {

	@Override
	protected String getAdMobId() {
		return "a150014510e7dc0";
	}

	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//putNewPictures();
	}
	
	private void putNewPictures(){
		String[] url =new String[]{
		"http://www.dudes411.com/planesSpitfire.jpg",
		"http://www.dudes411.com/planesME109.jpg",
		"http://www.dudes411.com/planesFockeWolf190.jpg",
		"http://www.dudes411.com/Planes%20P51D.jpg",
		"http://www.dudes411.com/planesMitsubishiZero.jpg",
		"http://www.militaryfactory.com/aircraft/imgs/bell-p39-airacobra.jpg",
		"http://www.military-aircraft.org.uk/ww2-fighter-planes/curtiss-p-40-warhawk.jpg",
		"http://www.military-aircraft.org.uk/ww2-fighter-planes/Curtiss%20P-40B-Warhawk.jpg",
		"http://www.military-aircraft.org.uk/ww2-fighter-planes/p-40-warhawk.jpg",
		"http://www.war44.com/misc/images/3/British_P40_Kittyhawk.jpg",
		"http://2.bp.blogspot.com/_MlcIJtVqC0I/SUfu3bJfQtI/AAAAAAAAB88/xGhaq0F-rd4/s1600-h/455885484_4938cc2a9b_b.jpg",
		"http://1.bp.blogspot.com/_MlcIJtVqC0I/SUfu3CdrLBI/AAAAAAAAB80/fBJdMdxZMpY/s1600-h/455884716_6a6a14c162_b.jpg",
		"http://1.bp.blogspot.com/_MlcIJtVqC0I/SUfu3CdrLBI/AAAAAAAAB80/fBJdMdxZMpY/s1600-h/455884716_6a6a14c162_b.jpg",
		"http://3.bp.blogspot.com/_MlcIJtVqC0I/SUfukmeLPwI/AAAAAAAAB8s/WXSNIdP4Ucg/s1600-h/455883884_090de1c2e4_b.jpg",
		"http://www.world-war-2-planes.com/images/corsairturning.jpg",
		"http://www.world-war-2-planes.com/images/vought_f4_corsair_small.jpg",
		"http://1.bp.blogspot.com/_MlcIJtVqC0I/SUfbbyRk_VI/AAAAAAAAB6I/BEg5mCThlX8/s400/109M.jpg",
		"http://4.bp.blogspot.com/_MlcIJtVqC0I/SUfcY3cHO1I/AAAAAAAAB6Y/jlC-Fq3d2CE/s1600-h/27_77247_e7bdd1aad5677fc.jpg",
		"http://ih2.redbubble.net/image.5339364.9446/flat,550x550,075,f.jpg",
		"http://pics.towerhobbies.com/imagel/i/litas0062.jpg",
		"http://www.vg-photo.com/wallpaper/1024x768/Mustang2_DSC_3436.jpg",
		"http://johnnycat.files.wordpress.com/2010/05/p38-lightning.jpg",
		"http://www.richard-seaman.com/Wallpaper/Aircraft/Bombers/BlenheimBankingLeft.jpg",
		"http://www.raf.mod.uk/downloads/wallpapers/1946_1949/vampire11024.jpg",
		"http://ahoy.tk-jk.net/ImagesJan20_2007/FaireyFirefly.jpg",
		"http://aircraft-list.com/keywords/Avro_Lancaster/Avro_Lancaster_64.jpg",
		"http://www.wwiivehicles.com/unitedkingdom/aircraft/bomber/handley-page-halifax-bomber/handley-page-halifax-bomber-01.png",
		"http://www.hoofsperformance.wwiionline.com/mainpage_pic.jpg",
		"http://www.worldwar02.com/wp-content/uploads/a6m.jpg",
		"http://www.worldwar02.com/wp-content/uploads/northrup-p-61.jpg",
		"http://www.richard-seaman.com/Wallpaper/Aircraft/Fighters/AmericanJets/F86Banking20DegreesLeft.jpg",
		"http://www.lilesnet.com/friends-conlin/images/p38.jpg",
		"http://www.lilesnet.com/friends-conlin/images/me109.jpg",
		"http://www.fiddlersgreen.net/aircraft/Grumman-Bearcat/IMAGES/Grumman-F8F-Bearcat-WWII-Fighter-Inflight.jpg",
		"http://www.fiddlersgreen.net/aircraft/Grumman-Bearcat/IMAGES/Grumman-F8F-Bearcat-WWII-Navy-Fighter-Title.jpg",
		"http://www.fiddlersgreen.net/aircraft/Grumman-Bearcat/IMAGES/Grumman-F8F-Bearcat-WWII-Navy-Fighter-Parked.jpg",
		"http://ww2-aircraft.com/images/aircraft/i-16-1.jpg",
		"http://www.aviation-central.com/1940-1945/images/aec1b-bb.jpg",
		"http://www.armchairgeneral.com/wordpress/wp-content/image/2008/specialfeatures/flyingheritagecollection/p-51-mustang.jpg",
		"http://www.warbirdphotos.net/aviapix/Fighters/P38/p38-2-.jpg",
		"http://www.learning-to-fly.com/images/Mitsubishi-Zero.jpg",
		"http://world-war-2-planes.webs.com/images/p38.jpg",
		"http://www.richard-seaman.com/Wallpaper/Aircraft/NonCombatants/Transport/C47Dakota.jpg"
		
		
		
		};
		int i=40;
		List<Picture> pictures=new ArrayList<Picture>();
		for (int j=0;j<url.length;j++){
			try {
				Log.i("ww2fighters",url[j]);
				Picture p = new Picture(j+i, url[j],Picture.getPictureThumbnail(url[j]));
				pictures.add(p);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		DatabaseHelper.connect(this).putPictures(pictures);
	}


}
