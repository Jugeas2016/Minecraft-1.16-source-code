/*    */ import com.mojang.datafixers.kinds.App;
/*    */ import com.mojang.datafixers.kinds.Applicative;
/*    */ import com.mojang.serialization.Codec;
/*    */ import com.mojang.serialization.codecs.RecordCodecBuilder;
/*    */ import java.util.function.BiFunction;
/*    */ 
/*    */ public class cmd implements cma {
/*    */   static {
/*  9 */     a = RecordCodecBuilder.create(☃ -> ☃.group((App)Codec.intRange(0, 255).fieldOf("height").forGetter(()), (App)ceh.b.fieldOf("state").forGetter(())).apply((Applicative)☃, cmd::new));
/*    */   }
/*    */ 
/*    */   
/*    */   public static final Codec<cmd> a;
/*    */   public final int b;
/*    */   public final ceh c;
/*    */   
/*    */   public cmd(int ☃, ceh ceh1) {
/* 18 */     this.b = ☃;
/* 19 */     this.c = ceh1;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cmd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */