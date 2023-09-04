package Rewards.Gemstone;

import Abstractions.IGameItem;

public class GemstoneRewards implements IGameItem {

    @Override
    public String open() {
        return "Gemstone";
    }
}