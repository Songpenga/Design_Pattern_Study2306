package design_Pattern.Template;

public abstract class DisplayAriticleTemplate {
	protected Article article;
	
	public DisplayAriticleTemplate(Article article) {
		this.article = article;
	}
	
	public final void display() {
		title();
		content();
		footer();
	}
	
	protected abstract void title();
	protected abstract void content();
	protected abstract void footer();
}
