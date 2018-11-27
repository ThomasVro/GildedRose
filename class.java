package edu.insightr.gildedrose;

interface IVisitable {
   void accept(IVisitor visitor);
}


public class Aged_Brie extends Item{

    public Aged_Brie(String name, int sellIn, int quality)
    {
        super(name, sellIn, quality);
    }

    public void updateQuality()
    {
        if (this.getQuality() < 50) {
            this.setQuality(this.getQuality() + 1);
        }

        if (this.getSellIn() < 0) {
            if (this.getQuality() < 50) {
                this.setQuality(this.getQuality() + 1);
            }
        }
    }
}

public class Backstage extends Item {

    public Backstage(String name, int sellIn, int quality)
    {
        super(name, sellIn, quality);

    }

    public void updateQuality()
    {
        if (getQuality() < 50) {
            setQuality(getQuality() + 1);

            if (getSellIn() < 11) {
                if (getQuality() < 50) {
                    setQuality(getQuality() + 1);
                }
            }

            if (getSellIn() < 6) {
                if (getQuality() < 50) {
                    setQuality(getQuality() + 1);
                }
            }
        }
    }
}

public class Conjured_mana extends Item {

    public Conjured_mana(String name, int sellIn, int quality)
    {
        super(name, sellIn, quality);

    }

    public void updateQuality()
    {
        if(getQuality() < 50)
        {
            if(getQuality()>1)
            {
                setQuality(getQuality() - 2);
            }
        }
    }
}

public class Dexterity_vest extends Item {

    public Dexterity_vest(String name, int sellIn, int quality)
    {
        super(name, sellIn, quality);

    }

    public void updateQuality()
    {

    }
}

public class Elixir extends Item {
    public Elixir(String name, int sellIn, int quality)
    {
        super(name, sellIn, quality);

    }

    public void updateQuality()
    {

    }
}

public class Sulfuras extends Item{

    public Sulfuras(String name, int sellIn, int quality)
    {
        super(name, sellIn, quality);
    }

    public void updateQuality()
    {

    }
}



