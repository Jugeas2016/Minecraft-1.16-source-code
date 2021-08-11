/*    */ import com.google.common.base.Predicates;
/*    */ import com.google.common.collect.ImmutableSet;
/*    */ import com.google.common.collect.Lists;
/*    */ import com.google.common.collect.Maps;
/*    */ import java.util.Arrays;
/*    */ import java.util.Collection;
/*    */ import java.util.Map;
/*    */ import java.util.Optional;
/*    */ import java.util.function.Predicate;
/*    */ import java.util.stream.Collectors;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class cfe<T extends Enum<T> & afs>
/*    */   extends cfj<T>
/*    */ {
/*    */   private final ImmutableSet<T> a;
/* 18 */   private final Map<String, T> b = Maps.newHashMap();
/*    */   
/*    */   protected cfe(String ☃, Class<T> clazz, Collection<T> collection) {
/* 21 */     super(☃, clazz);
/* 22 */     this.a = ImmutableSet.copyOf(collection);
/*    */     
/* 24 */     for (Enum enum_ : collection) {
/* 25 */       String str = ((afs)enum_).a();
/* 26 */       if (this.b.containsKey(str)) {
/* 27 */         throw new IllegalArgumentException("Multiple values have the same name '" + str + "'");
/*    */       }
/* 29 */       this.b.put(str, (T)enum_);
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public Collection<T> a() {
/* 35 */     return (Collection<T>)this.a;
/*    */   }
/*    */ 
/*    */   
/*    */   public Optional<T> b(String ☃) {
/* 40 */     return Optional.ofNullable(this.b.get(☃));
/*    */   }
/*    */ 
/*    */   
/*    */   public String a(T ☃) {
/* 45 */     return ((afs)☃).a();
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean equals(Object ☃) {
/* 50 */     if (this == ☃) {
/* 51 */       return true;
/*    */     }
/*    */     
/* 54 */     if (☃ instanceof cfe && super.equals(☃)) {
/* 55 */       cfe<?> cfe1 = (cfe)☃;
/* 56 */       return (this.a.equals(cfe1.a) && this.b.equals(cfe1.b));
/*    */     } 
/*    */     
/* 59 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public int b() {
/* 64 */     int ☃ = super.b();
/* 65 */     ☃ = 31 * ☃ + this.a.hashCode();
/* 66 */     ☃ = 31 * ☃ + this.b.hashCode();
/* 67 */     return ☃;
/*    */   }
/*    */   
/*    */   public static <T extends Enum<T> & afs> cfe<T> a(String ☃, Class<T> clazz) {
/* 71 */     return a(☃, clazz, (Predicate<T>)Predicates.alwaysTrue());
/*    */   }
/*    */   
/*    */   public static <T extends Enum<T> & afs> cfe<T> a(String ☃, Class<T> clazz, Predicate<T> predicate) {
/* 75 */     return a(☃, clazz, (Collection<T>)Arrays.<T>stream(clazz.getEnumConstants()).filter(predicate).collect(Collectors.toList()));
/*    */   }
/*    */   
/*    */   public static <T extends Enum<T> & afs> cfe<T> a(String ☃, Class<T> clazz, T... arrayOfT) {
/* 79 */     return a(☃, clazz, Lists.newArrayList((Object[])arrayOfT));
/*    */   }
/*    */   
/*    */   public static <T extends Enum<T> & afs> cfe<T> a(String ☃, Class<T> clazz, Collection<T> collection) {
/* 83 */     return new cfe<>(☃, clazz, collection);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cfe.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */