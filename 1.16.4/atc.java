/*    */ import com.google.common.collect.ImmutableMap;
/*    */ import java.util.Map;
/*    */ import java.util.Optional;
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
/*    */ public class atc
/*    */   extends arv<aqu>
/*    */ {
/*    */   private final float b;
/*    */   private final int c;
/*    */   private final int d;
/*    */   
/*    */   public atc(float ☃) {
/* 27 */     this(☃, 10, 7);
/*    */   }
/*    */   
/*    */   public atc(float ☃, int i, int j) {
/* 31 */     super((Map<ayd<?>, aye>)ImmutableMap.of(ayd.m, aye.b));
/*    */ 
/*    */     
/* 34 */     this.b = ☃;
/* 35 */     this.c = i;
/* 36 */     this.d = j;
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(aag ☃, aqu aqu1, long l) {
/* 41 */     Optional<dcn> optional = Optional.ofNullable(azj.b(aqu1, this.c, this.d));
/* 42 */     aqu1.cJ().a(ayd.m, optional.map(☃ -> new ayf(☃, this.b, 0)));
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\atc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */