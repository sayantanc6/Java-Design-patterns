package designpattern.builder;

public class BuilderTest {

	public static void main(String[] args) {
		
		AvatarBuilder smartPerson = new AvatarBuilder()
									.buildGlassType(GlassType.CONTACT_LENS)
									.buildHairType(HairType.BLONDE)
									.buildPersonality(new Smart())
									.build();
		
		AvatarBuilder shaggyPerson = new AvatarBuilder()
									 .buildGlassType(GlassType.GOGGLES)
									 .buildHairType(HairType.LONG)
									 .buildPersonality(new Shaggy())
									 .build();
		
		System.out.println("smart : "+smartPerson);
		System.out.println("shaggy : "+shaggyPerson);
	}

}
