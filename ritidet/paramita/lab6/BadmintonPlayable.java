/**
 * This BadmintonPlayable program is The interface contains two attributes are racketLength and 
 * worldRanking and four public methods which are getRacketLength(), setRacketLength(double), 
 * getWorldRanking(), setWorldRanking(int).
 * 
 * Auther: paramita ritidet
 * ID: 653040627-3
 * sec: 1
 * Date: 31 Janruary 2023
 */
package ritidet.paramita.lab6;

public interface BadmintonPlayable {
    public double raketLength = 0;
    public int worldRanking = 0;
    public double getRacketLength(); 
    public int getWorldRanking();
    public void setRacketLength(double raketLength);
    public void setWorldRanking(int worldRanking);
}