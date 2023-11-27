package designpattern.builder;

public class BuilderTest{

	private GlassType glassType;
	private HairType hairType;
	Personality personality;
	
	public AvatarBuilder() {
		super();
	}

	public AvatarBuilder buildGlassType(GlassType glassType) {
		this.glassType = glassType;
		return this;
	}
	
	public AvatarBuilder buildHairType(HairType hairType) {
		this.hairType = hairType;
		return this;
	}
	
	public AvatarBuilder buildPersonality(Personality personality) {
		this.personality = personality;
		return this;
	}
	
	public AvatarBuilder build() {
		return this;
	}

	@Override
	public String toString() {
		return "glassType=" + glassType + ", hairType=" + hairType + ", personality=" + personality
				+ "\n";
	}
}
