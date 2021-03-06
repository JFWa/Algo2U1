// Streuwertfunktion gemäß Multiplikationsmethode
// (Implementierung mit 32-Bit-Ganzzahlarithmetik).
class MultiplicationMethod extends AbstractHashFunction
{
    // Anzahl p von Bits.
    private int bits;

    // Parameter s = A'.
    private int seed;

    // Multiplikationsmethode für Tabellengröße N = 2 hoch p
    // mit Parameter s.
    public MultiplicationMethod (int p, int s)
    {
        super(1 << p);	// 1 << p entspricht 2 hoch p.
        bits = p;
        seed = s;
    }

    @Override
    public int compute(Object key)
    {
        int h = key.hashCode();
        return (h * seed) >>> (32 - bits);
    }
}
