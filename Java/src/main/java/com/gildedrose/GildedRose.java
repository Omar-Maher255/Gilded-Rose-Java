package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {

            if (item.quality < 50 && item.quality > 0) {

                switch (item.name) {

                    case "Aged Brie":
                        if (item.sellIn <= 0) {
                            item.quality += 2;
                        } else {
                            item.quality++;
                        }
                        break;


                    case "Sulfuras, Hand of Ragnaros":
                        item.quality = 80;
                        break;

                    case "Backstage passes to a TAFKAL80ETC concert":

                        if (item.sellIn <= 0) {
                            item.quality = 0;
                            break;
                        } else if (item.sellIn < 6) {
                            item.quality = Math.min((item.quality + 3), 50);
                            break;
                        } else if (item.sellIn < 11) {
                            item.quality = Math.min(item.quality + 2, 50);
                            break;
                        } else {
                            item.quality++;
                            break;
                        }


                    case "Conjured Mana Cake":
                        if (item.sellIn < 0) {
                            item.quality -= 4;
                        } else {
                            item.quality -= 2;
                        }
                        break;


                    default:
                        if (item.sellIn < 0) {
                            item.quality -= 2;
                        } else {
                            item.quality--;
                        }
                        break;

                }
                item.sellIn--;
            }
        }
    }


}