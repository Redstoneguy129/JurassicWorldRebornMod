package mod.reborn.server.dinosaur;


import mod.reborn.server.entity.Diet;
import mod.reborn.server.entity.dinosaur.LudodactylusEntity;
import mod.reborn.server.period.TimePeriod;

public class LudodactylusDinosaur extends Dinosaur
{
    public static final double SPEED = 0.4F;
    public LudodactylusDinosaur()
    {
        super();

        this.setName("Ludodactylus");
        this.setDinosaurType(DinosaurType.AGGRESSIVE);
        this.setDinosaurClass(LudodactylusEntity.class);
        this.setTimePeriod(TimePeriod.CRETACEOUS);
        this.setEggColorMale(0x565656, 0x1D1E20);
        this.setEggColorFemale(0x884D3E, 0x35302B);
        this.setHealth(5, 15);
        this.setSpeed((SPEED -0.05), SPEED);
        this.setStrength(3, 10);
        this.setMaximumAge(fromDays(40));
        this.setEyeHeight(0.48F, 1.25F);
        this.setSizeX(0.4F, 1.0F);
        this.setSizeY(0.55F, 1.35F);
        this.setStorage(18);
        this.setDiet((Diet.CARNIVORE.get()));
        this.setBones("leg_bones", "pelvis", "skull", "tail_vertebrae", "teeth", "wing_bones");
        this.setHeadCubeName("Head");
        this.setScale(0.8F, 0.35F);
        this.shouldDefendOffspring();
        this.setAttackBias(120);
        this.setImprintable(true);
        this.setStorage(12);
        this.setBreeding(false, 0, 2, 20, false, true);
    }
}