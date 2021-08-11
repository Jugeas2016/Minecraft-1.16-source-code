/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonNull;
/*     */ import com.google.gson.JsonObject;
/*     */ import com.google.gson.JsonPrimitive;
/*     */ import com.mojang.brigadier.StringReader;
/*     */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*     */ import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
/*     */ import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
/*     */ import java.util.function.BiFunction;
/*     */ import java.util.function.Function;
/*     */ import java.util.function.Supplier;
/*     */ import javax.annotation.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class bz<T extends Number>
/*     */ {
/*     */   public static class d
/*     */     extends bz<Integer>
/*     */   {
/*  21 */     public static final d e = new d(null, null); private final Long f;
/*     */     
/*     */     private static d a(StringReader ☃, @Nullable Integer integer1, @Nullable Integer integer2) throws CommandSyntaxException {
/*  24 */       if (integer1 != null && integer2 != null && integer1.intValue() > integer2.intValue()) {
/*  25 */         throw b.createWithContext(☃);
/*     */       }
/*     */       
/*  28 */       return new d(integer1, integer2);
/*     */     }
/*     */     private final Long g;
/*     */     @Nullable
/*     */     private static Long a(@Nullable Integer ☃) {
/*  33 */       return (☃ == null) ? null : Long.valueOf(☃.longValue() * ☃.longValue());
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     private d(@Nullable Integer ☃, @Nullable Integer integer1) {
/*  40 */       super(☃, integer1);
/*  41 */       this.f = a(☃);
/*  42 */       this.g = a(integer1);
/*     */     }
/*     */     
/*     */     public static d a(int ☃) {
/*  46 */       return new d(Integer.valueOf(☃), Integer.valueOf(☃));
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public static d b(int ☃) {
/*  54 */       return new d(Integer.valueOf(☃), null);
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public boolean d(int ☃) {
/*  62 */       if (this.c != null && this.c.intValue() > ☃) {
/*  63 */         return false;
/*     */       }
/*  65 */       if (this.d != null && this.d.intValue() < ☃) {
/*  66 */         return false;
/*     */       }
/*  68 */       return true;
/*     */     }
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
/*     */     public static d a(@Nullable JsonElement ☃) {
/*  82 */       return (d)a(☃, e, afd::g, d::new);
/*     */     }
/*     */     
/*     */     public static d a(StringReader ☃) throws CommandSyntaxException {
/*  86 */       return a(☃, ☃ -> ☃);
/*     */     }
/*     */     
/*     */     public static d a(StringReader ☃, Function<Integer, Integer> function) throws CommandSyntaxException {
/*  90 */       return (d)a(☃, d::a, Integer::parseInt, CommandSyntaxException.BUILT_IN_EXCEPTIONS::readerInvalidInt, function);
/*     */     }
/*     */   }
/*     */   
/*     */   public static class c extends bz<Float> {
/*  95 */     public static final c e = new c(null, null); private final Double f; private final Double g;
/*     */     
/*     */     private static c a(StringReader ☃, @Nullable Float float_1, @Nullable Float float_2) throws CommandSyntaxException {
/*  98 */       if (float_1 != null && float_2 != null && float_1.floatValue() > float_2.floatValue()) {
/*  99 */         throw b.createWithContext(☃);
/*     */       }
/*     */       
/* 102 */       return new c(float_1, float_2);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     private static Double a(@Nullable Float ☃) {
/* 107 */       return (☃ == null) ? null : Double.valueOf(☃.doubleValue() * ☃.doubleValue());
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     private c(@Nullable Float ☃, @Nullable Float float_1) {
/* 114 */       super(☃, float_1);
/* 115 */       this.f = a(☃);
/* 116 */       this.g = a(float_1);
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public static c b(float ☃) {
/* 128 */       return new c(Float.valueOf(☃), null);
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public boolean d(float ☃) {
/* 136 */       if (this.c != null && this.c.floatValue() > ☃) {
/* 137 */         return false;
/*     */       }
/* 139 */       if (this.d != null && this.d.floatValue() < ☃) {
/* 140 */         return false;
/*     */       }
/* 142 */       return true;
/*     */     }
/*     */     
/*     */     public boolean a(double ☃) {
/* 146 */       if (this.f != null && this.f.doubleValue() > ☃) {
/* 147 */         return false;
/*     */       }
/* 149 */       if (this.g != null && this.g.doubleValue() < ☃) {
/* 150 */         return false;
/*     */       }
/* 152 */       return true;
/*     */     }
/*     */     
/*     */     public static c a(@Nullable JsonElement ☃) {
/* 156 */       return (c)a(☃, e, afd::e, c::new);
/*     */     }
/*     */     
/*     */     public static c a(StringReader ☃) throws CommandSyntaxException {
/* 160 */       return a(☃, ☃ -> ☃);
/*     */     }
/*     */     
/*     */     public static c a(StringReader ☃, Function<Float, Float> function) throws CommandSyntaxException {
/* 164 */       return (c)a(☃, c::a, Float::parseFloat, CommandSyntaxException.BUILT_IN_EXCEPTIONS::readerInvalidFloat, function);
/*     */     }
/*     */   }
/*     */   
/* 168 */   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(new of("argument.range.empty"));
/* 169 */   public static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(new of("argument.range.swapped"));
/*     */   
/*     */   protected final T c;
/*     */   protected final T d;
/*     */   
/*     */   protected bz(@Nullable T ☃, @Nullable T t1) {
/* 175 */     this.c = ☃;
/* 176 */     this.d = t1;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public T a() {
/* 181 */     return this.c;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public T b() {
/* 186 */     return this.d;
/*     */   }
/*     */   
/*     */   public boolean c() {
/* 190 */     return (this.c == null && this.d == null);
/*     */   }
/*     */   
/*     */   public JsonElement d() {
/* 194 */     if (c()) {
/* 195 */       return (JsonElement)JsonNull.INSTANCE;
/*     */     }
/*     */     
/* 198 */     if (this.c != null && this.c.equals(this.d)) {
/* 199 */       return (JsonElement)new JsonPrimitive((Number)this.c);
/*     */     }
/*     */     
/* 202 */     JsonObject ☃ = new JsonObject();
/* 203 */     if (this.c != null) {
/* 204 */       ☃.addProperty("min", (Number)this.c);
/*     */     }
/* 206 */     if (this.d != null) {
/* 207 */       ☃.addProperty("max", (Number)this.d);
/*     */     }
/* 209 */     return (JsonElement)☃;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected static <T extends Number, R extends bz<T>> R a(@Nullable JsonElement ☃, R r, BiFunction<JsonElement, String, T> biFunction, a<T, R> a1) {
/* 218 */     if (☃ == null || ☃.isJsonNull()) {
/* 219 */       return r;
/*     */     }
/*     */     
/* 222 */     if (afd.b(☃)) {
/* 223 */       Number number = (Number)biFunction.apply(☃, "value");
/* 224 */       return a1.create((T)number, (T)number);
/*     */     } 
/* 226 */     JsonObject jsonObject = afd.m(☃, "value");
/* 227 */     Number number1 = jsonObject.has("min") ? (Number)biFunction.apply(jsonObject.get("min"), "min") : null;
/* 228 */     Number number2 = jsonObject.has("max") ? (Number)biFunction.apply(jsonObject.get("max"), "max") : null;
/* 229 */     return a1.create((T)number1, (T)number2);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected static <T extends Number, R extends bz<T>> R a(StringReader ☃, b<T, R> b1, Function<String, T> function, Supplier<DynamicCommandExceptionType> supplier, Function<T, T> function1) throws CommandSyntaxException {
/* 239 */     if (!☃.canRead()) {
/* 240 */       throw a.createWithContext(☃);
/*     */     }
/*     */     
/* 243 */     int i = ☃.getCursor();
/*     */     
/*     */     try {
/* 246 */       Number number2, number1 = a(a(☃, function, supplier), function1);
/*     */       
/* 248 */       if (☃.canRead(2) && ☃.peek() == '.' && ☃.peek(1) == '.') {
/* 249 */         ☃.skip();
/* 250 */         ☃.skip();
/* 251 */         number2 = a(a(☃, function, supplier), function1);
/* 252 */         if (number1 == null && number2 == null) {
/* 253 */           throw a.createWithContext(☃);
/*     */         }
/*     */       } else {
/* 256 */         number2 = number1;
/*     */       } 
/*     */       
/* 259 */       if (number1 == null && number2 == null) {
/* 260 */         throw a.createWithContext(☃);
/*     */       }
/* 262 */       return b1.create(☃, (T)number1, (T)number2);
/* 263 */     } catch (CommandSyntaxException commandSyntaxException) {
/* 264 */       ☃.setCursor(i);
/* 265 */       throw new CommandSyntaxException(commandSyntaxException.getType(), commandSyntaxException.getRawMessage(), commandSyntaxException.getInput(), i);
/*     */     } 
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private static <T extends Number> T a(StringReader ☃, Function<String, T> function, Supplier<DynamicCommandExceptionType> supplier) throws CommandSyntaxException {
/* 271 */     int i = ☃.getCursor();
/* 272 */     while (☃.canRead() && a(☃)) {
/* 273 */       ☃.skip();
/*     */     }
/* 275 */     String str = ☃.getString().substring(i, ☃.getCursor());
/* 276 */     if (str.isEmpty()) {
/* 277 */       return null;
/*     */     }
/*     */     try {
/* 280 */       return function.apply(str);
/* 281 */     } catch (NumberFormatException numberFormatException) {
/* 282 */       throw ((DynamicCommandExceptionType)supplier.get()).createWithContext(☃, str);
/*     */     } 
/*     */   }
/*     */   
/*     */   private static boolean a(StringReader ☃) {
/* 287 */     char c = ☃.peek();
/* 288 */     if ((c >= '0' && c <= '9') || c == '-') {
/* 289 */       return true;
/*     */     }
/*     */     
/* 292 */     if (c == '.') {
/* 293 */       return (!☃.canRead(2) || ☃.peek(1) != '.');
/*     */     }
/*     */     
/* 296 */     return false;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private static <T> T a(@Nullable T ☃, Function<T, T> function) {
/* 301 */     return (☃ == null) ? null : function.apply(☃);
/*     */   }
/*     */   
/*     */   @FunctionalInterface
/*     */   public static interface a<T extends Number, R extends bz<T>> {
/*     */     R create(@Nullable T param1T1, @Nullable T param1T2);
/*     */   }
/*     */   
/*     */   @FunctionalInterface
/*     */   public static interface b<T extends Number, R extends bz<T>> {
/*     */     R create(StringReader param1StringReader, @Nullable T param1T1, @Nullable T param1T2) throws CommandSyntaxException;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */