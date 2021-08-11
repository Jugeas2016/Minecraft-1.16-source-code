/*    */ import java.util.Optional;
/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class djr
/*    */   extends dkf
/*    */ {
/*    */   public djr(dez ☃) {
/* 16 */     this(☃, ☃.t());
/*    */   }
/*    */   
/*    */   private djr(dez ☃, @Nullable der der1) {
/* 20 */     super("options.fullscreen.resolution", -1.0D, (der1 != null) ? (der1.e() - 1) : -1.0D, 1.0F, dkd1 -> {
/*    */           if (☃ == null)
/*    */             return Double.valueOf(-1.0D); 
/*    */           Optional<dey> optional = dez1.f();
/*    */           return optional.<Double>map(()).orElse(Double.valueOf(-1.0D));
/*    */         }(dkd1, double_) -> {
/*    */           if (☃ == null)
/*    */             return; 
/*    */           if (double_.doubleValue() == -1.0D) {
/*    */             dez1.a(Optional.empty());
/*    */           } else {
/*    */             dez1.a(Optional.of(☃.a(double_.intValue())));
/*    */           } 
/*    */         }(dkd1, dkf1) -> {
/*    */           if (☃ == null)
/*    */             return new of("options.fullscreen.unavailable"); 
/*    */           double d = dkf1.a(dkd1);
/*    */           return (d == -1.0D) ? dkf1.a(new of("options.fullscreen.current")) : dkf1.a(new oe(☃.a((int)d).toString()));
/*    */         });
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\djr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */