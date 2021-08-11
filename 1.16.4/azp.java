/*    */ import com.mojang.datafixers.kinds.App;
/*    */ import com.mojang.datafixers.kinds.Applicative;
/*    */ import com.mojang.datafixers.util.Function4;
/*    */ import com.mojang.serialization.Codec;
/*    */ import com.mojang.serialization.codecs.RecordCodecBuilder;
/*    */ import java.util.Objects;
/*    */ 
/*    */ public class azp {
/*    */   private final fx a;
/*    */   private final azr b;
/*    */   
/*    */   public static Codec<azp> a(Runnable ☃) {
/* 13 */     return RecordCodecBuilder.create(instance -> instance.group((App)fx.a.fieldOf("pos").forGetter(()), (App)gm.aj.fieldOf("type").forGetter(()), (App)Codec.INT.fieldOf("free_tickets").orElse(Integer.valueOf(0)).forGetter(()), (App)RecordCodecBuilder.point(☃)).apply((Applicative)instance, azp::new));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private int c;
/*    */ 
/*    */   
/*    */   private final Runnable d;
/*    */ 
/*    */ 
/*    */   
/*    */   private azp(fx ☃, azr azr1, int i, Runnable runnable) {
/* 27 */     this.a = ☃.h();
/* 28 */     this.b = azr1;
/* 29 */     this.c = i;
/* 30 */     this.d = runnable;
/*    */   }
/*    */   
/*    */   public azp(fx ☃, azr azr1, Runnable runnable) {
/* 34 */     this(☃, azr1, azr1.b(), runnable);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected boolean b() {
/* 44 */     if (this.c <= 0) {
/* 45 */       return false;
/*    */     }
/*    */     
/* 48 */     this.c--;
/* 49 */     this.d.run();
/* 50 */     return true;
/*    */   }
/*    */   
/*    */   protected boolean c() {
/* 54 */     if (this.c >= this.b.b()) {
/* 55 */       return false;
/*    */     }
/*    */     
/* 58 */     this.c++;
/* 59 */     this.d.run();
/* 60 */     return true;
/*    */   }
/*    */   
/*    */   public boolean d() {
/* 64 */     return (this.c > 0);
/*    */   }
/*    */   
/*    */   public boolean e() {
/* 68 */     return (this.c != this.b.b());
/*    */   }
/*    */   
/*    */   public fx f() {
/* 72 */     return this.a;
/*    */   }
/*    */   
/*    */   public azr g() {
/* 76 */     return this.b;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean equals(Object ☃) {
/* 81 */     if (this == ☃) {
/* 82 */       return true;
/*    */     }
/* 84 */     if (☃ == null || getClass() != ☃.getClass()) {
/* 85 */       return false;
/*    */     }
/*    */     
/* 88 */     return Objects.equals(this.a, ((azp)☃).a);
/*    */   }
/*    */ 
/*    */   
/*    */   public int hashCode() {
/* 93 */     return this.a.hashCode();
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\azp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */