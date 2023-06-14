package design_Pattern.Template;

import java.util.ArrayList;

public class SimpleDisplayArticle extends DisplayAriticleTemplate{

	public SimpleDisplayArticle(Article article) {
		super(article);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void title() {
		System.out.println(article.getTitle());
	}

	@Override
	protected void content() {
		ArrayList<String> content = article.getContent();
		int cntLines = content.size();
		for(int i=0; i<cntLines; i++) {
			System.out.println(content.get(i));
		}
		
	}

	@Override
	protected void footer() {
		System.out.println(article.getFooter());		
	}

}
