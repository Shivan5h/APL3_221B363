
// Test class
public class Test {
    public static void main(String[] args) {
        Voice voiceSystem = new Voice();

        // Preparing the array of animals
        Animal[] animals = voiceSystem.prepareVoice();

        // Playing the voices
        voiceSystem.hear(animals);
    }
}
