package Rewards.Gemstone;

import Abstractions.IGameItem;
import Abstractions.ItemGenerator;

public class GemstoneGenerator extends ItemGenerator {
    @Override
    public IGameItem createItem() {
        return new GemstoneRewards();
    }
}
