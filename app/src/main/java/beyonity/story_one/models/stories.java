package beyonity.story_one.models;

import android.graphics.Bitmap;

/**
 * Created by mohan on 9/15/17.
 */

public class stories {

	String storyTitle;
	String category;
	String likes;
	String dislikes;
	//Bitmap storyCover;

	public stories(String storyTitle, String category, String likes, String dislikes) {
		this.storyTitle = storyTitle;
		this.category = category;
		this.likes = likes;
		this.dislikes = dislikes;

	}

	public String getStoryTitle() {
		return storyTitle;
	}

	public void setStoryTitle(String storyTitle) {
		this.storyTitle = storyTitle;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getLikes() {
		return likes;
	}

	public void setLikes(String likes) {
		this.likes = likes;
	}

	public String getDislikes() {
		return dislikes;
	}

	public void setDislikes(String dislikes) {
		this.dislikes = dislikes;
	}

/*	public Bitmap getStoryCover() {
		return storyCover;
	}

	public void setStoryCover(Bitmap storyCover) {
		this.storyCover = storyCover;
	}*/
}
