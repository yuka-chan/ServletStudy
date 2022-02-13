package model;

public class SiteEVLogic {
	public void addLike(SiteEV siteEV) {
		int count = siteEV.getLike();
		siteEV.setLike(count + 1);
	}
	
	public void addDislike(SiteEV siteEV) {
		int count = siteEV.getDislike();
		siteEV.setDislike(count + 1);
	}
}
