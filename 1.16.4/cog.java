/*    */ import com.mojang.datafixers.kinds.App;
/*    */ import com.mojang.datafixers.kinds.Applicative;
/*    */ import com.mojang.serialization.Codec;
/*    */ import com.mojang.serialization.codecs.RecordCodecBuilder;
/*    */ import java.util.List;
/*    */ import java.util.Random;
/*    */ import java.util.function.BiFunction;
/*    */ import java.util.stream.Collectors;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class cog
/*    */   extends coi
/*    */ {
/*    */   public static final Codec<cog> a;
/*    */   private final List<coi> b;
/*    */   
/*    */   static {
/* 19 */     a = RecordCodecBuilder.create(☃ -> ☃.group((App)coi.e.listOf().fieldOf("elements").forGetter(()), (App)d()).apply((Applicative)☃, cog::new));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public cog(List<coi> ☃, cok.a a1) {
/* 27 */     super(a1);
/* 28 */     if (☃.isEmpty()) {
/* 29 */       throw new IllegalArgumentException("Elements are empty");
/*    */     }
/* 31 */     this.b = ☃;
/* 32 */     b(a1);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public List<ctb.c> a(csw ☃, fx fx1, bzm bzm1, Random random) {
/* 52 */     return ((coi)this.b.get(0)).a(☃, fx1, bzm1, random);
/*    */   }
/*    */ 
/*    */   
/*    */   public cra a(csw ☃, fx fx1, bzm bzm1) {
/* 57 */     cra cra = cra.a();
/* 58 */     for (coi coi1 : this.b) {
/* 59 */       cra cra1 = coi1.a(☃, fx1, bzm1);
/* 60 */       cra.c(cra1);
/*    */     } 
/*    */     
/* 63 */     return cra;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(csw ☃, bsr bsr1, bsn bsn1, cfy cfy1, fx fx1, fx fx2, bzm bzm1, cra cra1, Random random, boolean bool) {
/* 68 */     for (coi coi1 : this.b) {
/* 69 */       if (!coi1.a(☃, bsr1, bsn1, cfy1, fx1, fx2, bzm1, cra1, random, bool)) {
/* 70 */         return false;
/*    */       }
/*    */     } 
/* 73 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public coj<?> a() {
/* 78 */     return coj.b;
/*    */   }
/*    */ 
/*    */   
/*    */   public coi a(cok.a ☃) {
/* 83 */     super.a(☃);
/* 84 */     b(☃);
/* 85 */     return this;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 90 */     return "List[" + (String)this.b.stream().map(Object::toString).collect(Collectors.joining(", ")) + "]";
/*    */   }
/*    */   
/*    */   private void b(cok.a ☃) {
/* 94 */     this.b.forEach(coi1 -> coi1.a(☃));
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cog.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */