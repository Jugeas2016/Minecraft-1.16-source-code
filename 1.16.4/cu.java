/*     */ import com.mojang.brigadier.StringReader;
/*     */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*     */ import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
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
/*     */ public class cu
/*     */ {
/*  17 */   public static final cu a = new cu(null, null);
/*     */   
/*  19 */   public static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(new of("argument.range.ints"));
/*     */   
/*     */   private final Float c;
/*     */   private final Float d;
/*     */   
/*     */   public cu(@Nullable Float ☃, @Nullable Float float_1) {
/*  25 */     this.c = ☃;
/*  26 */     this.d = float_1;
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
/*     */   @Nullable
/*     */   public Float a() {
/*  73 */     return this.c;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public Float b() {
/*  78 */     return this.d;
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
/*     */   public static cu a(StringReader ☃, boolean bool, Function<Float, Float> function) throws CommandSyntaxException {
/*     */     Float float_2;
/* 121 */     if (!☃.canRead()) {
/* 122 */       throw bz.a.createWithContext(☃);
/*     */     }
/* 124 */     int i = ☃.getCursor();
/* 125 */     Float float_1 = a(b(☃, bool), function);
/*     */     
/* 127 */     if (☃.canRead(2) && ☃.peek() == '.' && ☃.peek(1) == '.')
/* 128 */     { ☃.skip();
/* 129 */       ☃.skip();
/* 130 */       float_2 = a(b(☃, bool), function);
/* 131 */       if (float_1 == null && float_2 == null) {
/* 132 */         ☃.setCursor(i);
/* 133 */         throw bz.a.createWithContext(☃);
/*     */       }  }
/* 135 */     else { if (!bool && ☃.canRead() && ☃.peek() == '.') {
/* 136 */         ☃.setCursor(i);
/* 137 */         throw b.createWithContext(☃);
/*     */       } 
/* 139 */       float_2 = float_1; }
/*     */     
/* 141 */     if (float_1 == null && float_2 == null) {
/* 142 */       ☃.setCursor(i);
/* 143 */       throw bz.a.createWithContext(☃);
/*     */     } 
/* 145 */     return new cu(float_1, float_2);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private static Float b(StringReader ☃, boolean bool) throws CommandSyntaxException {
/* 150 */     int i = ☃.getCursor();
/* 151 */     while (☃.canRead() && c(☃, bool)) {
/* 152 */       ☃.skip();
/*     */     }
/* 154 */     String str = ☃.getString().substring(i, ☃.getCursor());
/* 155 */     if (str.isEmpty()) {
/* 156 */       return null;
/*     */     }
/*     */     try {
/* 159 */       return Float.valueOf(Float.parseFloat(str));
/* 160 */     } catch (NumberFormatException numberFormatException) {
/* 161 */       if (bool) {
/* 162 */         throw CommandSyntaxException.BUILT_IN_EXCEPTIONS.readerInvalidDouble().createWithContext(☃, str);
/*     */       }
/* 164 */       throw CommandSyntaxException.BUILT_IN_EXCEPTIONS.readerInvalidInt().createWithContext(☃, str);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private static boolean c(StringReader ☃, boolean bool) {
/* 170 */     char c = ☃.peek();
/* 171 */     if ((c >= '0' && c <= '9') || c == '-') {
/* 172 */       return true;
/*     */     }
/*     */     
/* 175 */     if (bool && c == '.') {
/* 176 */       return (!☃.canRead(2) || ☃.peek(1) != '.');
/*     */     }
/*     */     
/* 179 */     return false;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private static Float a(@Nullable Float ☃, Function<Float, Float> function) {
/* 184 */     return (☃ == null) ? null : function.apply(☃);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */