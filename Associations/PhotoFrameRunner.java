class PhotoFrameRunner
{
	public static void main(String [] values)
	{
    Colors [] colors={Colors.BLUE , Colors.YELLOW};
	Types [] types={Types.WOOD , Types.PLASTIC};
		
		PhotoFrames pf = new PhotoFrames ("Savi Digital",colors);
		pf.setSize(4);
		//pf.setColor(colors);
		pf.setFrame(types);
		pf.printData();

	}
}