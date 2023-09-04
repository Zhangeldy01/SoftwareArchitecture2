package Core;

import Abstractions.ItemGenerator;
import Rewards.Gold.GoldGenerator;
import Rewards.Silver.SilverGenerator;
import Rewards.Gemstone.GemstoneGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Core {
    // Логика игры
    public void run() {
        List<ItemGenerator> generatorList = listToFill(new GoldGenerator(), 12, new SilverGenerator(), 18, new GemstoneGenerator(), 3);

        Random random = new Random();
        ItemGenerator myGenerator = generatorList.get(random.nextInt(generatorList.size()));
        System.out.println(myGenerator.openReward());
    }
    private List<ItemGenerator> listToFill(ItemGenerator golds, int gold, ItemGenerator silvers, int silver, ItemGenerator gems, int gem){
        List<ItemGenerator> generatorList = new ArrayList<>();
        for (int i = 0; i < gold; i++) {
            generatorList.add(new GoldGenerator());
        }
        for (int i = 0; i < silver; i++) {
            generatorList.add(new SilverGenerator());
        }
        for (int i = 0; i < gem; i++) {
            generatorList.add(new GemstoneGenerator());
        }
        return generatorList;
    }
}