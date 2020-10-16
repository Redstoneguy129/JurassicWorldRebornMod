package mod.reborn.server.dinosaur;

import mod.reborn.server.entity.Diet;
import mod.reborn.server.entity.dinosaur.AllosaurusEntity;
import mod.reborn.server.period.TimePeriod;

public class AllosaurusDinosaur extends Dinosaur {
    public static final double SPEED = 0.42F;
    public AllosaurusDinosaur() {
        super();

        this.setName("Allosaurus");
        this.setDinosaurType(DinosaurType.AGGRESSIVE);
        this.setDinosaurClass(AllosaurusEntity.class);
        this.setTimePeriod(TimePeriod.JURASSIC);
        this.setEggColorMale(0x31472B, 0xC9C6B9);
        this.setEggColorFemale(0x532D2D, 0xC4A58C);
        this.setHealth(10, 50);
        this.setSpeed((SPEED -0.05), SPEED);
        this.setAttackSpeed(1.1);
        this.setStrength(1, 20);
        this.setMaximumAge(fromDays(45));
        this.setEyeHeight(0.45F, 1.6F);
        this.setSizeX(0.4F, 2.5F);
        this.setSizeY(0.65F, 4F);
        this.setDiet(Diet.CARNIVORE.get());
        this.setBones("leg_bones", "neck_vertebrae", "arm_bones", "claw", "foot_bones", "leg_bones", "pelvis", "shoulder", "tooth", "ribcage", "skull", "tail_vertebrae");
        this.setHeadCubeName("Head");
        this.setBreeding(false, 2, 4, 40, false, true);
        this.setScale(2.4F, 0.31F);
        this.shouldDefendOffspring();
        String[][] recipe = {{"", "", "","neck_vertebrae","skull"},
                {"tail_vertebrae", "pelvis", "ribcage","shoulder","tooth"},
                {"", "leg_bones", "", "arm_bones", "claw"},
                {"", "foot_bones", "", "", ""}};
        this.setRecipe(recipe);
        doSkeletonCheck();
    }

    protected void doSkeletonCheck(){
        this.enableSkeleton();
    }
}
