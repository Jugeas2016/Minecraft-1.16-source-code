/*    */ import com.google.common.collect.ImmutableList;
/*    */ import com.mojang.datafixers.kinds.App;
/*    */ import com.mojang.datafixers.kinds.Applicative;
/*    */ import com.mojang.serialization.Codec;
/*    */ import com.mojang.serialization.codecs.RecordCodecBuilder;
/*    */ import java.util.List;
/*    */ import java.util.function.BiFunction;
/*    */ 
/*    */ public class brk
/*    */ {
/* 11 */   public static final brk a = new brk((List<String>)ImmutableList.of("vanilla"), (List<String>)ImmutableList.of());
/*    */   static {
/* 13 */     b = RecordCodecBuilder.create(☃ -> ☃.group((App)Codec.STRING.listOf().fieldOf("Enabled").forGetter(()), (App)Codec.STRING.listOf().fieldOf("Disabled").forGetter(())).apply((Applicative)☃, brk::new));
/*    */   }
/*    */ 
/*    */   
/*    */   public static final Codec<brk> b;
/*    */   private final List<String> c;
/*    */   private final List<String> d;
/*    */   
/*    */   public brk(List<String> ☃, List<String> list1) {
/* 22 */     this.c = (List<String>)ImmutableList.copyOf(☃);
/* 23 */     this.d = (List<String>)ImmutableList.copyOf(list1);
/*    */   }
/*    */   
/*    */   public List<String> a() {
/* 27 */     return this.c;
/*    */   }
/*    */   
/*    */   public List<String> b() {
/* 31 */     return this.d;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\brk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */