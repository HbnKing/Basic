package book.thinkingjava.chapter9;

public class Waveform {

	public static long counter;
	private final long id = counter++;
	public String toString() {
		return "Waveform" +id;
	}
}
class Filter{
	public String name() {
		return getClass().getSimpleName();
	}
	public Waveform process(Waveform input) {
		return input;
	}
	
}
class LowPass extends Filter{
	double cutoff;
	public LowPass(double cutoff) {
		this.cutoff = cutoff;
	}
	@Override
	public Waveform process(Waveform input) {
		return input;
	} 
}

class HighPass extends Filter{
	double cutoff;
	public HighPass(double cutoff) {
		this.cutoff = cutoff;
	}
	@Override
	public Waveform process(Waveform input) {
		return input;
	} 
}

class BandPass extends Filter{
	double lowCutoff,highCutoff;
	public BandPass(double lowCut,double highCut){
		lowCutoff = lowCut;
		highCutoff = highCut;
	}
	@Override
	public Waveform process(Waveform input) {
		return input;
	} 
}
