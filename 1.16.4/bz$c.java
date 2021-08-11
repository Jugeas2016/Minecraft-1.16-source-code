/*     */ import com.google.gson.JsonElement;
/*     */ import com.mojang.brigadier.StringReader;
/*     */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*     */ import java.util.function.Function;
/*     */ import javax.annotation.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class c
/*     */   extends bz<Float>
/*     */ {
/*  95 */   public static final c e = new c(null, null); private final Double f;
/*     */   
/*     */   private static c a(StringReader ☃, @Nullable Float float_1, @Nullable Float float_2) throws CommandSyntaxException {
/*  98 */     if (float_1 != null && float_2 != null && float_1.floatValue() > float_2.floatValue()) {
/*  99 */       throw b.createWithContext(☃);
/*     */     }
/*     */     
/* 102 */     return new c(float_1, float_2);
/*     */   }
/*     */   private final Double g;
/*     */   @Nullable
/*     */   private static Double a(@Nullable Float ☃) {
/* 107 */     return (☃ == null) ? null : Double.valueOf(☃.doubleValue() * ☃.doubleValue());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private c(@Nullable Float ☃, @Nullable Float float_1) {
/* 114 */     super(☃, float_1);
/* 115 */     this.f = a(☃);
/* 116 */     this.g = a(float_1);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static c b(float ☃) {
/* 128 */     return new c(Float.valueOf(☃), null);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean d(float ☃) {
/* 136 */     if (this.c != null && this.c.floatValue() > ☃) {
/* 137 */       return false;
/*     */     }
/* 139 */     if (this.d != null && this.d.floatValue() < ☃) {
/* 140 */       return false;
/*     */     }
/* 142 */     return true;
/*     */   }
/*     */   
/*     */   public boolean a(double ☃) {
/* 146 */     if (this.f != null && this.f.doubleValue() > ☃) {
/* 147 */       return false;
/*     */     }
/* 149 */     if (this.g != null && this.g.doubleValue() < ☃) {
/* 150 */       return false;
/*     */     }
/* 152 */     return true;
/*     */   }
/*     */   
/*     */   public static c a(@Nullable JsonElement ☃) {
/* 156 */     return (c)a(☃, e, afd::e, c::new);
/*     */   }
/*     */   
/*     */   public static c a(StringReader ☃) throws CommandSyntaxException {
/* 160 */     return a(☃, ☃ -> ☃);
/*     */   }
/*     */   
/*     */   public static c a(StringReader ☃, Function<Float, Float> function) throws CommandSyntaxException {
/* 164 */     return (c)a(☃, c::a, Float::parseFloat, CommandSyntaxException.BUILT_IN_EXCEPTIONS::readerInvalidFloat, function);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bz$c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */