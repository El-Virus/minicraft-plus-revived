package minicraft.screen;

import minicraft.gfx.Color;
import minicraft.gfx.Font;
import minicraft.gfx.Screen;

public class AboutMenu extends Menu {
	private Menu parent; // Creates a parent object to go back to
	
	/** The about menu is a read menu about what the game was made for. Only contains text and a black background */
	public AboutMenu(Menu parent) {
		this.parent = parent;
	}

	public void tick() {
		if (input.getKey("escape").clicked || input.getKey("enter").clicked) {
			game.setMenu(parent); //goes back to parent if either above button is pressed
		}
	}
	
	/** Renders the text on the screen */
	public void render(Screen screen) {
		screen.clear(0); // clears the screen to make it black.
		
		Font.drawCentered("About MinicraftPlus", screen, 1 * 8, Color.get(0, 555));
		String abouttext = "Moded by David.b and +Dillyg10+, and Chris J. Our goal is to expand Minicraft to be more fun and continuous.\nMinicraft was originally made by Markus Perrson for ludum dare 22 competition.";
		Font.drawParagraph(abouttext, screen, 4, 3 * 8, true, 1, Color.get(0, 333));
		
		/*Font.draw("Moded by David.b and +Dillyg10+", screen, 2 * 8 + 4, 3 * 8, Color.get(0, 333, 333, 333));
		Font.draw("Our goal is to expand Minicraft to", screen, 1 * 8 + 4, 5 * 8, Color.get(0, 333, 333, 333));
		Font.draw("be more fun and continuous.", screen, 5 * 8 + 4, 6 * 8, Color.get(0, 333, 333, 333));
		Font.draw("Minicraft made by Markus Perrson", screen, 1 * 8 + 4, 8 * 8, Color.get(0, 333, 333, 333));
		Font.draw("for ludum dare 22 competition.", screen, 2 * 8 + 4, 9 * 8, Color.get(0, 333, 333, 333));*/
	}
}