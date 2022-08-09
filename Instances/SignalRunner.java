class SignalRunner
{
 public static void main(String [] args)
 {
// String name;
// String colors;
// Stirng area;
// int totalLights;
// String red;
// Stirng yellow;
// String green;
// int duration;
   Signal signal=new Signal();
   signal.name="Trafic Signal";
   signal.colors="Red Yellow Green";
   signal.area="BTM";
   signal.totalLights=3;
   signal.red="Stop";
   signal.yellow="Ready";
   signal.green="Go";
   signal.duration=120;
   {
   System.out.println( signal.name);
   System.out.println( signal.colors);
   System.out.println( signal.area);
   System.out.println( signal.totalLights);
   System.out.println( signal.red);
   System.out.println( signal.yellow);
   System.out.println( signal.green);
   System.out.println( signal.duration);
   }
 }
}